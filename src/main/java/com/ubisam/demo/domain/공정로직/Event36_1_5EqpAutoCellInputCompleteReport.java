package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 1-5. 자동 셀 투입 완료 보고 with CellID & TrayID
@Data
public class Event36_1_5EqpAutoCellInputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectCell objectCell;
    
    private CompleteStatus completeStatus; // COMPLETE / Not NOT_COMPLETE
    public enum CompleteStatus { COMPLETE, NOT_COMPLETE }
}
