package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 등급처리 요청 Confirm
@Data
public class Event49HostCellGradeProcessAck {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유 
    
}
