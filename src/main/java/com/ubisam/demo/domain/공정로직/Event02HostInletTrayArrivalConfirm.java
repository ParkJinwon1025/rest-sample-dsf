package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입부 Tray 도착 Confirm
@Data
public class Event02HostInletTrayArrivalConfirm {
    
    @Id
    private Long timestamp;
    private ObjectTray ObjecTray;
    private String status; // 도착 확인 성공 여부
}
