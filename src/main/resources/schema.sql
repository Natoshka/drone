drop table if exists drone cascade;
drop table if exists drone_model cascade;
drop table if exists drone_medication cascade;
drop table if exists drone_battery_log cascade;
drop table if exists medication cascade;

drop sequence if exists seq_drone_model;
drop sequence if exists seq_drone;
drop sequence if exists seq_medication;

create sequence seq_drone_model;

create table drone_model (
    id bigint default next value for seq_drone_model primary key,
    name varchar(100)
);

create sequence seq_drone;

create table drone (
    id bigint default next value for seq_drone primary key,
    serial_number varchar(100),
    model_id int,
    weight_limit int not null,
    battery_capacity int not null,
    state varchar(20),
    foreign key (model_id) references drone_model(id),
    constraint check_state check (
        state in ('IDLE', 'LOADING', 'LOADED', 'DELIVERING', 'DELIVERED', 'RETURNING'))
);

create sequence seq_medication;

create table medication (
    id bigint default next value for seq_medication primary key,
    name text,
    weight int not null,
    code text,
    image text
);

create table drone_medication (
    drone_id bigint not null,
    medication_id bigint not null,
    foreign key (drone_id) references drone(id),
    foreign key (medication_id) references medication(id)
);

create table drone_battery_log (
    id bigint auto_increment primary key,
    drone_id bigint not null,
    battery_capacity int,
    log_datetime timestamp default current_timestamp(),
    foreign key (drone_id) references drone(id)
);