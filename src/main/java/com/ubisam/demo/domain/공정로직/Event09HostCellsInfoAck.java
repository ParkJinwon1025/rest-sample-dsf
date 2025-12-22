package com.ubisam.demo.domain.공정로직;

import java.util.List;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 전체 셀 정보 Confirm
@Data
public class Event09HostCellsInfoAck {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;

    private List<ObjectCell> cellList;

    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;

}
