package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

// 바코드 리더기
@Entity
@Data
public class ObjectBarcode {
    
    @Id
    private UUID id;
    private String name;
    private String type;
    private String location;
}
