package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectPort;
import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.공정로직.Event01InputPortInputTrayBound.BoundStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 62. 배춸부포트 배출Tray Bound
@Data
public class Event62OutputPortOutputTrayBound {

    @Id
    private Long timestamp;
    private ObjectPort objectPort;
    private ObjectTray objectTray;

    private BoundStatus boundStatus; // Bound / UnBound

}
