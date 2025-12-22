package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectDSF;
import com.ubisam.demo.domain.공정로직.Event36_1_7EqpAutoCellInputCompleteReport.CompleteStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 39. 공정 프로세스 완료 보고
@Data
public class Event39EqpProcessEndReport {

    @Id
    private Long timestamp;
    private ObjectDSF objectEQP;

    private CompleteStatus completeStatus; // Complete / Not Complete
}
