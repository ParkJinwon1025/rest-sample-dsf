package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 투입셀 정보 검사 요청 with CellID
@Data
public class Event35_2_3EqpInputCellInfoInspectionRequest {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
