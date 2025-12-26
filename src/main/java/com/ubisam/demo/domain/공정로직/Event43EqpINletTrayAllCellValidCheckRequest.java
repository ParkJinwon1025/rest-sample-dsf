package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 43. 투입 Tray 전체 Cell Valid Check 요청 with TrayID
@Data
public class Event43EqpInletTrayAllCellValidCheckRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;

}
