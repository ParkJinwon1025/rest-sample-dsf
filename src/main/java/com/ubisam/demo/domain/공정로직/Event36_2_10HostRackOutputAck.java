package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// 2-10. Rack 출고 요청 Confirm
@Data
public class Event36_2_10HostRackOutputAck {

    @Id
    private Long timestamp;
    private Event36_2_9EqpRackOutputRequest event36_2_9;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
