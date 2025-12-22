package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입셀 정보 검사 요청 with CellID & TrayID
@Data
public class Event36_1_3EqpInputCellInfoInspectionRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectCell objectCell;
    
    private String action;
}
