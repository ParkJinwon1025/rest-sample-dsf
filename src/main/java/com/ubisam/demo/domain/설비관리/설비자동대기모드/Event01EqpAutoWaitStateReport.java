package com.ubisam.demo.domain.설비관리.설비자동대기모드;

import com.ubisam.demo.domain.ObjectDSF;

import jakarta.persistence.Id;
import lombok.Data;

// 1. EQP 알람 상태 Report
@Data
public class Event01EqpAutoWaitStateReport {

    @Id
    private Long timestamp;
    private ObjectDSF objectDSF;
    
    private AutoWaitStatus autoWaitStatus;
    private enum AutoWaitStatus { AUTOWAIT, NONE }
}
