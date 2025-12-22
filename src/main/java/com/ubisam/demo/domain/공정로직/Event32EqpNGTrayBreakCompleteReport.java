package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray Break 완료 with TrayID
@Data
public class Event32EqpNGTrayBreakCompleteReport {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;

    private String action;
    
}
