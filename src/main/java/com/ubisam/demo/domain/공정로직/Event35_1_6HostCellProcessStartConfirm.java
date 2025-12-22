package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 공정 시작 보고 Confirm
@Data
public class Event35_1_6HostCellProcessStartConfirm {

    @Id
    private Long timeStamp;
    private ObjectCell objectCell;
    private ObjectUser objectUser;
    private String status;
    
}
