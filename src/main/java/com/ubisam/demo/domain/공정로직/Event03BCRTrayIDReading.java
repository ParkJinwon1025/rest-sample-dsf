package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectBarcode;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드리더기 TrayID Read
@Data
public class Event03BCRTrayIDReading {
    
    @Id
    private Long timestamp;
    private ObjectTray objectTray;
    private ObjectBarcode objectBarcode;

}
