package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 수동 셀 투입 완료 보고 Confirm
@Data
public class Event36_2_14HostManualCellInputCompleteAck {
    
    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
}
