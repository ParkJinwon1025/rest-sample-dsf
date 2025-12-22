package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 배출 완료 보고 Confirm
@Data
public class Event57HostOutletTrayOutputCompleteAck {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectUser objectUser;
    private String status;

}
