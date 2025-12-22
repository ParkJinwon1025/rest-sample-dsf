package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 수동 셀 투입 완료 보고 with CellID
@Data
public class Event36_2_13EqpManualCellInputCompleteReport {
    
    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
    private String action;
}
