package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 배출 요청 with TrayID
@Data
public class Event56EqpNGTrayOutputRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    
}
