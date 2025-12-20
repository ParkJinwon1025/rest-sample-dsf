package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRack;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 완료 요청 with TrayID/RackID
@Data
public class Event35_2_11EqpRackOutputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectRack objectRack;

}
