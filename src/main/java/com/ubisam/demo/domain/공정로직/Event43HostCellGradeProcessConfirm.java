package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 등급처리 요청 Confirm
@Data
public class Event43HostCellGradeProcessConfirm {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    private String status; 
    
}
