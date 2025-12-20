package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


// Port : 설비의 출입구 / Tray & Cell이 들어가고 나가는 물리적 위치 

@Entity
@Data
public class ObjectPort {

    @Id
    private UUID id;
    private String name;
    private String type;
    private String location;
    
}
