package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 투입 완료 요청
@Data
public class Event25EventEqpOutletTrayInputCompleteReport {

    @Id
    private Long stamp;
    private ObjectTray objectTray;

    private String action;
    
}
