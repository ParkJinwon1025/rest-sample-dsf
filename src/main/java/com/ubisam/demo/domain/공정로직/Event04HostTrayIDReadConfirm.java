package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectBarcode;
import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드리더기 TrayID Read Confirm
@Data
public class Event04HostTrayIDReadConfirm {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectBarcode objectBarcode;
    private ObjectUser objectUser;
    private String status; // OK / NG
    
}
