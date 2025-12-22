package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRack;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 요청 Confirm
@Data
public class Event35_2_10HostRackOutputCompleteConfirm {

    @Id
    private Long timestamp;
    private ObjectRack objectRack;
    private ObjectUser objectUser;
    private String status; //응답
    
}
