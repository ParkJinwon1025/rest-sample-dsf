package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 투입셀 정보 검사 요청 Confirm
@Data
public class Event35_2_4HostInputCellInfoInspectionConfirm {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    private ObjectUser objectUser;
    private String status;
    
}
