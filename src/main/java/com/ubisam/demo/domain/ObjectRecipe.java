package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

// 레시피 : 공정 실행 조건/파라미터
@Entity
@Data
public class ObjectRecipe {

    @Id
    private UUID id;
    private Integer recipeName;
    
    // 작업 조건
    private Integer pressTime; //DSF & EOL : 가압시간(sec)
    private String ocvWorkType; // OCV 작업 타입
    private String ocvTabDir; // Tab Direction ( 단방향, 양방향 )
    
    // .. 일부 생략
    
    
}
