package com.ubisam.demo.domain;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ObjectRecipe {
    @Id
    private UUID id;
    private String recipeId;
    private String name;
    
    private Integer consCurrent; //Constant 전류값
    private Integer voltage; // Constant 전압값
    private Integer judgeVoltage; // 판정 전압값

    private String ocvWorkType; // 작업 Type
    private String ocvTabDir; // Tab Direcion
    
    private Integer pressTime; // 가압 시간

    // 나머지 조건 이하 생략

    
}

