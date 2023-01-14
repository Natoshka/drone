package com.interview.drone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.interview.drone"})
@EntityScan(basePackages = {"com.interview.drone.entity"})
@EnableJpaRepositories("com.interview.drone.repository")
public class DroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroneApplication.class, args);
	}

}
