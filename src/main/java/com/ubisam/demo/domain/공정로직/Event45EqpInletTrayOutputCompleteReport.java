package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.공정로직.Event36_1_7EqpAutoCellInputCompleteReport.CompleteStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 45. 투입 Tray 배출 완료 보고 with TrayId
@Data
public class Event45EqpInletTrayOutputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectTray objectTray; 

    private CompleteStatus completeStatus; // Complete / Not Complete
     
}
