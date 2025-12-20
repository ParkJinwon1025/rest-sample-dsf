package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 수동 투입 Tray 정보 확인 요청 with TrayID
@Data
public class Event35_2_5EqpManualInputTrayInfoRequest {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;

}
