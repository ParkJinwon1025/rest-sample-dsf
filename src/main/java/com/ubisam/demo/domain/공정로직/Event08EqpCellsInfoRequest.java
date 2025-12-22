package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 전체 셀 정보 요청 with TrayID
@Data
public class Event08EqpCellsInfoRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;

    private String action; 
}
