package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRack;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 완료 요청 with TrayID/RackID
@Data
public class Event16EqpRackOutputCompleteRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectRack objectRack;

    private String action; 

}
