package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray Break 완료 Confirm
@Data
public class Event33HostNGTrayBreakCompleteAck {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
