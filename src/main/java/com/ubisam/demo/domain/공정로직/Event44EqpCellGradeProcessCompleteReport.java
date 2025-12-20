package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 등급처리 완료 보고
@Data
public class Event44EqpCellGradeProcessCompleteReport {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
