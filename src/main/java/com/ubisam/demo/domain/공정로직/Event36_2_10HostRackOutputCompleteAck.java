package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRack;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 요청 Confirm
@Data
public class Event36_2_10HostRackOutputCompleteAck {

    @Id
    private Long timestamp;
    private ObjectRack objectRack;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
