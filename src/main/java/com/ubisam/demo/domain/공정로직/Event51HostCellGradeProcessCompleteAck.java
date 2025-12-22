package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 등급처리 완료 보고 Confirm
@Data
public class Event51HostCellGradeProcessCompleteAck {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
