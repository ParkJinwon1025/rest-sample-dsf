package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRecipe;
import com.ubisam.demo.domain.ObjectRoute;

import jakarta.persistence.Id;
import lombok.Data;

// Recipe 요청 Confirm with RouteID
@Data
public class Event35_2_8HostRecipeInfoConfirm {

    @Id
    private Long timestamp;
    private ObjectRoute objectRoute;
    private ObjectRecipe objectRecipe;
    private String status;
    
}
