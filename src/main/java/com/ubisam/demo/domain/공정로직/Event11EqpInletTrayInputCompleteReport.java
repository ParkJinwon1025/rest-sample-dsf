package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 투입 완료 보고
@Data
public class Event11EqpInletTrayInputCompleteReport {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
