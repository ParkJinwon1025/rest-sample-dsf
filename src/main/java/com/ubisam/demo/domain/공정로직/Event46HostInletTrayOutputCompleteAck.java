package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 배출 완료 보고 Confirm
@Data
public class Event46HostInletTrayOutputCompleteAck {

    @Id
    private Long tiemstamp;
    private ObjectTray objectTray;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
