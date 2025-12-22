package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

// Rack : 여러 Tray를 적재하는 선반/보관 구조물 + 에이징 등 대기 공정에 사용
@Entity
@Data
public class ObjectRack {

    @Id
    private UUID id;
    private String name;
    private String type;
    private String location;

}
