package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 자동 셀 투입 완료보고 Confirm
@Data
public class Event36_1_8HostAutoCellInputCompleteAck {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectCell objectCell;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
