package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 전체 셀 정보 Confirm
@Data
public class Event10HostCellsInfoConfirm {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;
}
