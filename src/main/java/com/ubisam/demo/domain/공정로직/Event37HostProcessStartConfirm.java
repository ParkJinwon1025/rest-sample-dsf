package com.ubisam.demo.domain.공정로직;


import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 공정 시작 보고 Confirm
@Data
public class Event37HostProcessStartConfirm {

    @Id
    private Long timestamp;
    private ObjectUser user;
    private ObjectUser objectUser;
    private String status; 

}
