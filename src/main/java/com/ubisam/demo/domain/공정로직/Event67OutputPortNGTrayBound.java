package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectPort;
import com.ubisam.demo.domain.ObjectTray;
import com.ubisam.demo.domain.공정로직.Event01InputPortInputTrayBound.BoundStatus;

import jakarta.persistence.Id;
import lombok.Data;

// 67. 배출부포트 NGTray Bound
@Data
public class Event67OutputPortNGTrayBound {

    @Id
    private Long timestamp;
    private ObjectPort objectPort;
    private ObjectTray objectTray;

    private BoundStatus boundStatus; // BOUND / UNBOUND

}
