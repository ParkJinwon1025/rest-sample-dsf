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
    private String grade; // Tray 등급
    private String location;
    private String usage; // Tray 용도
    private String status; //Run, End, Move, Wait, Manual, Fire 등등

    private Long trayInputDate; // Tray 생성 일자
    private String irayInputLineID; // Tray 생성 라인
    private String inputObjectID; // Tray 생성 위치
    
    private Integer inputCellInt; // 투입 수량
    private Integer procInputCellCnt; // 공정에 투입 Cell 수량
    private Integer currCellCnt; // Tray내 Cell의 수량

    private Long startTime;
    private Long endTime;

    private String barcodeId; // 물류에서 마지막 barcode Read 위치 => Tray 위치 확인용
    private Long barcodeReadTime; // 바코드 Read 시간

    private String proStepFlag; // 판정 결과 ex) 1, 2, G ,X

    private Integer ForceInCnt; // 강제입고 수량

    private String nextEqpTypeID; // 다음 공정 설비군 ID
    private String nextOperGroupID; //다음 공정 Operation Group
    private String nextOperID; // 다음 공정 작업 ID
    
}
