package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectPort;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;


// 1. 투입부 포트 투입 Tray UnBound
@Data
public class Event01InputPortInputTrayBound {

    @Id
    private Long timestamp;
    private ObjectPort objectPort;
    private ObjectTray objectTray;

    private BoundStatus boundStatus; // BOUND / UNBOUND
    public enum BoundStatus { BOUND, UNBOUND }
}
