package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ObjectDSF {

    @Id
    private UUID id;
    private Integer comAddres; // TCP/IP 통신 Address
    private Integer comPort; // 송수신 port 번호

    private ObjectTray objectTray; // 작업예정 or 작업 중인 Tray

    private String comsStatus; // 통신 상태
    private String operMode; // 동작 상태
    private String unitStatus; // 장치상태 ( P: Power On, O: Power Off )
    private String processStatus; // 진행 상태
    
    private String oldTrayId; // 현재 작업 중인 Tray 이전에 작업한 TrayID 명
    private String troubleCode; // 트러블 코드
    private String fireStatus; // 화재 감지 여부
    private String fireEventTime; // 화재 감지 시간

    private String eqpUseState; // 설비 사용 여부
    private boolean isManual; // 수동 동작 여부
    private boolean isAutoWait; // 자동 대기 여부
    
    private String hasAlarm; // 알람 여부
    private String alarm; // 알람 내용
    
}
