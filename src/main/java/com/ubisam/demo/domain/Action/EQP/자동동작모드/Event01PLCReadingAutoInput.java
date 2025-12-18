package com.ubisam.demo.domain.Action.EQP.자동동작모드;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadingAutoInput {
    
    @Id
    private Long timeStamp;
    private ObjectPLC readingPLC;
    private boolean bit;

}
