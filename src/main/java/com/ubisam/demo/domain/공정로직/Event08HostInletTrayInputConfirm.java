package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 투입 요청 Confirm
@Data
public class Event08HostInletTrayInputConfirm {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectUser objectUser;
    private String status; // 응답
}
