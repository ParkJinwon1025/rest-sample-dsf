package com.ubisam.demo.domain.공정로직;

import java.util.List;

import com.ubisam.demo.domain.ObjectBarcode;
import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드리더기 CellID Read Confirm
@Data
public class Event06HostCellIDReadConfirm {

    @Id
    private Long timestamp;
    private List<ObjectCell> cellList;
    private ObjectBarcode objectBarcode;
    private String status; // OK / NG
    
}
