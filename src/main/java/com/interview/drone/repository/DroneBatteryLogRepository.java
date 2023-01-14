package com.interview.drone.repository;

import com.interview.drone.entity.DroneBatteryLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneBatteryLogRepository extends JpaRepository<DroneBatteryLog, Long> {
}
