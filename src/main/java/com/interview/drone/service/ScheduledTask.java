package com.interview.drone.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@EnableScheduling
public class ScheduledTask {

    @Value("${jobs.enabled}")
    private Boolean isEnabled;

    private final DroneService droneService;

    @Scheduled(fixedDelayString = "${jobs.delay}")
    public void removeFiles() {
        if (BooleanUtils.isTrue(isEnabled)) {
            droneService.makeBatteryCapacityLog();
            log.info("The log of battery capacities is saved");
        }
    }
}
