package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 배출 완료 보고 Confirm
@Data
public class Event45HostInletTrayOutputCompleteConfirm {

    @Id
    private Long tiemstamp;
    private ObjectTray objectTray;
    private ObjectUser objectUser;
    private String status; // 응답
    
}
