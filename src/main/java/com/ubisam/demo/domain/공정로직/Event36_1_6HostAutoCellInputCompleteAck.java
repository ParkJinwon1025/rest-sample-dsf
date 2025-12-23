package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 1-6. 자동 셀 투입 완료보고 Confirm
@Data
public class Event36_1_6HostAutoCellInputCompleteAck {

    @Id
    private Long timestamp;
    private Event36_1_5EqpAutoCellInputCompleteReport event36_1_7;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
