package com.ubisam.demo.domain.설비관리.설비가동정지;

import com.ubisam.demo.domain.ObjectDSF;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event2HostHasTroubleStateAck {

    @Id
    private Long timestamp;
    private ObjectDSF objectDSF;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
