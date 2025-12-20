package com.ubisam.demo.domain.공정로직;

import java.util.List;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 투입 Tray 전체 Cell Valid Check 요청 Confirm
@Data
public class Event39HostInletTrayAllCellValidCheckConfirm {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private List<ObjectCell> cellList;
    private String status;
}
