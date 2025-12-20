package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 배출 요청 with TrayID
@Data
public class Event36EqpInletTrayOutputRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
