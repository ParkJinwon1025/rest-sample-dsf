package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 수동 셀 투입 요청 with CellID
@Data
public class Event35_2_1EqpManualCellInputRequest {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
