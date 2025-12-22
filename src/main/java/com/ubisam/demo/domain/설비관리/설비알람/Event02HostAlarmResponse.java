package com.ubisam.demo.domain.설비관리.설비알람;

import com.ubisam.demo.domain.ObjectDSF;

import jakarta.persistence.Id;
import lombok.Data;

// Host 알람 Response;
@Data
public class Event02HostAlarmResponse {
    
    @Id
    private Long timestamp;
    private ObjectDSF objectDSF;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
}
