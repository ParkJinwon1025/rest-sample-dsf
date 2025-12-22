package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectPort;
import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.공정로직.Event01InputPortInputTrayBound.BoundStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 18. 투입부포트 배출Tray UnBound
@Data
public class Event18InputPortOutputTrayBound {

    @Id
    private Long timestamp;
    private ObjectPort objectPort;
    private ObjectTray objectTray;

    private BoundStatus boundStatus; // BOUND / UNBOUND


}
