package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 강제배출 요청 Confirm
@Data
public class Event65HostCellForceOutputConfirm {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    private ObjectUser objectUser;
    private String status;
    
}
