package com.ubisam.demo.domain.설비관리.설비알람;

import com.ubisam.demo.domain.ObjectDSF;

import jakarta.persistence.Id;
import lombok.Data;

// 1. EQP 알람 상태 Report
@Data
public class Event01EqpAlarmStateReport {

    @Id
    private Long timestamp;
    private ObjectDSF objectDSF;
    
    private AlarmStatus alarmStatus;
    private enum AlarmStatus { EXIST, NONE }
}
