package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.공정로직.Event36_1_7EqpAutoCellInputCompleteReport.CompleteStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 50. 셀 등급처리 완료 보고
@Data
public class Event50EqpCellGradeProcessCompleteReport {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;

    private CompleteStatus completeStatus; // Complete / Not Complete
    
}
