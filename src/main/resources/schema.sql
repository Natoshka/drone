
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
    weight_limit int,
    battery_capacity int,
    state varchar(20),
    foreign key (model_id) references drone_model(id),
    constraint check_state check (
        state in ('IDLE', 'LOADING', 'LOADED', 'DELIVERING', 'DELIVERED', 'RETURNING'))
);

create sequence seq_medication;

create table medication (
    id bigint default next value for seq_medication primary key,
    name text,
    weight int,
    code text,
    image text
);