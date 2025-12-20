package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// Recipe 요청 with TrayID
@Data
public class Event13EqpRecipeInfoRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
