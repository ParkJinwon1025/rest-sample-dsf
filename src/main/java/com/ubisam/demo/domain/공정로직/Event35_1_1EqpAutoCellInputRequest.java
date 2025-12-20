package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 자동 투입 - 자동 셀 투입 요청 with CellID & TrayID
@Data
public class Event35_1_1EqpAutoCellInputRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectCell objectCell;
    
}
