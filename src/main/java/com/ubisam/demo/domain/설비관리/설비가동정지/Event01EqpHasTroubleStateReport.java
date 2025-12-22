package com.ubisam.demo.domain.설비관리.설비가동정지;

import com.ubisam.demo.domain.ObjectDSF;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01EqpHasTroubleStateReport {

    @Id
    private Long timestamp;
    private ObjectDSF objectDSF;
    
    private TroubleStatus troubleStatus; 
    private enum TroubleStatus { TROUBLE, NONE }
}
