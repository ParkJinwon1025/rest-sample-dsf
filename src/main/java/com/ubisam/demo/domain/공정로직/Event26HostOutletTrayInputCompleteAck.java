package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 투입 완료 요청 Confirm
@Data
public class Event26HostOutletTrayInputCompleteAck {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
