package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 공정 시작 보고 with CellID
@Data
public class Event35_1_5EqpCellProcessStartReport {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
