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

    private Long inputDate; // Cell 생성 일자
    private String inputObjectId; // Cell 생성 위치
    private String inputLineId; // Cell 생성 라인

    private String grade; // 등급

    private Long startTime; // 공정작업 시작시간
    private Long endTime; // 공정작업 종료시간

    
}
