package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;
import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 자동 투입 - 자동 셀 투입 요청 Confirm
@Data
public class Event35_1_2HostAutoCellInputConfirm {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectCell objectCell;
    private ObjectUser objectUser;
    private String status; //응답
    
}
