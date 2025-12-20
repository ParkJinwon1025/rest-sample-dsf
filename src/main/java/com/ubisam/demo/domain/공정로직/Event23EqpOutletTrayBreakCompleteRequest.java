package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray Break 완료 요청
@Data
public class Event23EqpOutletTrayBreakCompleteRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
