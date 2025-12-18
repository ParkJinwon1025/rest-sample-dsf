package com.ubisam.demo.domain.Action.EQP.수동투입;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadingHandInput {
    
    @Id
    private Long timeStamp;
    private ObjectPLC readingPLC;
    private boolean bit;

}
