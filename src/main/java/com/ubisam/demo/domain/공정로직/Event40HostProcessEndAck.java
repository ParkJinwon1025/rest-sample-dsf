package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event40HostProcessEndAck {

    @Id
    private Long timestamp;
    private ObjectUser objectUser;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
}
