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
    
    private String agingType; // 고온 / 상온
    private String bufferRack; // Buffer 영역 이용 시 Y
    private Integer troubleCode; // 마지막 Trouble Code;
    private String FireStatus; // 화재 감지
    private Long FireEventTime; // 화재 감지 시간
    
    private ObjectTray objectTray;
    private Long trayInputDate;

    private Long startTime; // 투입 시간
    private Long endTime; // 배출 예정 시간

}
