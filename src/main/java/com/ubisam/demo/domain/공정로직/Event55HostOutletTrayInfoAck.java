package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 배출 Tray 정보 확인 요청 Confirm
@Data
public class Event55HostOutletTrayInfoAck {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectUser objectUser;
    private String status;
    
}
