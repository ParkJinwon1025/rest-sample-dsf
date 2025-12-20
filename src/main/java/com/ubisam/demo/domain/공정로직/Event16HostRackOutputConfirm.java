package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRack;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 요청 Confirm
@Data
public class Event16HostRackOutputConfirm {

    @Id
    private Long timestamp;
    private ObjectRack objectRack;
    private ObjectTray objectTray;
    private String status; //응답
    
}
