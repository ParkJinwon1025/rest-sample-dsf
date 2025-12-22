package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 수동 투입 Tray 정보 확인 Confirm
@Data
public class Event36_2_6HostManualInputTrayInfoAck {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유
    
}
