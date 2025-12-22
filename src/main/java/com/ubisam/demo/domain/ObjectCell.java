package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

// Cell : 배터리 기본 단위 / 공정을 거치는 최소 작업 단위 
@Entity
@Data
public class ObjectCell {

    @Id
    private UUID id;
    private String name;
    private String type;
    private String location;

}
