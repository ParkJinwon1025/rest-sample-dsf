package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectDSF;
import com.ubisam.demo.domain.공정로직.Event36_1_5EqpCellProcessStartReport.ProcessStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 37. 공정 시작 보고
@Data
public class Event37EqpProcessStartReport {

    @Id
    private Long timestamp;
    private ObjectDSF objectEQP;

    private ProcessStatus processStatus; // START / END 
}
