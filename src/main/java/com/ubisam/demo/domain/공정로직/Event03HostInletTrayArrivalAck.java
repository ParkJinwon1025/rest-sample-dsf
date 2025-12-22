package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입부 Tray 도착 Confirm
@Data
public class Event03HostInletTrayArrivalAck {
    
    @Id
    private Long timestamp;
    private ObjectTray ObjecTray;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;

}
