package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 등급처리 요청 with CellID
@Data
public class Event42EqpCellGradeProcessRequest {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
