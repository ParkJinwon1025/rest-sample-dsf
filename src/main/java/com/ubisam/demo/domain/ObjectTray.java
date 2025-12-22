package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

// Tray : 여러 Cell들을 담는 운반 용기
@Entity
@Data
public class ObjectTray {
    
    @Id
    private UUID id;
    private String name;
    private String type;
    private String location;
    
}
