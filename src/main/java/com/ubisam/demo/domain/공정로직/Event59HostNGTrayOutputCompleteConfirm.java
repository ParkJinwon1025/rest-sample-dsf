package com.ubisam.demo.domain.공정로직;

import jakarta.persistence.Id;
import lombok.Data;

// NG Tray 배출 완료 보고 Confirm
@Data
public class Event59HostNGTrayOutputCompleteConfirm {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private String status;
    
}
