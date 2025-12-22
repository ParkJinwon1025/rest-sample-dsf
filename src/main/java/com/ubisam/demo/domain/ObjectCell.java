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

    private int prodModel; // 생상 가능한 Model
    private int routeId; // Route ID
    private int LotId; // Lot ID

    private String inputData; // Cell 생성 일자
    private String inputObjectId; // Cell 생성 위치
    private String inputLineId; // Cell 생성 라인


}
