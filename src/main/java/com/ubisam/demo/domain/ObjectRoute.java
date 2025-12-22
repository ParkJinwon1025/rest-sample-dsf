package com.ubisam.demo.domain;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

// 루트 : 공정 경로or 흐름 / Cell/Tray가 거쳐야 할 공정 순서
@Entity
@Data
public class ObjectRoute {

    @Id
    private UUID id;
    private String routeId;
    private List<String> steps;

    public ObjectRoute(String routeId, List<String> steps) {
        this.routeId = routeId;
        this.steps = List.copyOf(steps);
    }
    public List<String> steps() { return steps; }
    
}
