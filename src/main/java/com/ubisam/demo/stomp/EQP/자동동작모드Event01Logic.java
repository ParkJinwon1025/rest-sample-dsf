package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Read;
import lombok.Locked.Write;

public class 자동동작모드Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean AutoInputBit){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
    //     if(AutoInputBit == 1){
    //         PLC의 메모리 맵에서 CellIn_TrayIDBCR 필드의 값을 Read 후 trayID 변수에 저장
    //         PLC의 메모리 맵에서 CellIDBCR 필드의 값을 Read 후 cellID 변수에 저장
    //         cellID 변수의 Null 문자와 앞뒤 공백 제거
    //         trayID 변수의 Null 문자와 앞뒤 공백 제거

    //         if(cellID에 값이 있고 비어있지 않다면){
    //             PLC 메모리의 InputCellNo 필드에서 값을 Read 후 inputCellNo 변수에 저장
    //             rs라는 이름의 변수에 현재 Cell 정보 Read
    //             rsTray라는 이름의 변수에 현재 Tray 정보 Read
    //             rsTrayEmpty라는 이름의 변수에 trayId가 TrayId인 빈(Empty) 트레이 정보 Read
                
    //             if(rsTrayEmpty가 null이 아니라면){

    //                 if(rsTrayEmpty의 장비 타입이 0이고 작동그룹ID가 0일 때){
                        
    //                     if(cellId과 trayId를 가지고 1개의 셀을 자동 생성할 때 셀 생성에 실패한 경우){
    //                         PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                         PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_CELL_ID_CREATE_FAIL" Write
    //                         return;
    //                     }
    //                     isCellNew = true;
    //                     rsTray = rsTrayEmpty;
                        
    //                 }
    //                 else {
    //                     PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                     PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_TRAY_OPERGROUP_ERROR" Write
    //                     return;
    //                 }
    //             }
    //             else {
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                 PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_TRAY_OPERGROUP_ERROR" Write
    //                 return;
    //             }

    //         }
    //         rs라는 이름의 변수에 현재 Cell 정보 Read
    //         if(rs가 null이거나 rsTray가 null 일 때){
    //             PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //             PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_CELL_ID_NOT_FOUND" Write
    //         }
    //         else {
    //             if(rs 변수의 TrayId가 traId변수의 값과 다를 때 ) {
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                 PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_CELL_VALIDATION_MISMATCH" Write
    //                 return;
    //             }

    //             if(Grade 등급이 null이 아니거나 Grade 등급이 A가 아닐 때) {
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                 PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_CELL_GRADE_NG" Write
    //                 return;
    //             }

    //             cellNo라는 이름의 변수안에 rs.CellNo의 값을 Short형으로 변환
    //             if(Cell이 새로 생성된게 아니고, inputCellNo가 0이 아니고, cellNo가 inputCellNo과 같지 않다면){
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                 PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_CELL_NUM_MISMATCH" Write    
    //                 return;
    //             }

    //             if(rs의 다음장비TypeId가 D가 아니거나 다음작동그룹이 1이 아닐 경우){
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                 PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_TRAY_OPERGROUP_ERROR" Write    
    //             }

    //             inOperID = rs.NextOperGroupID + rs.NextOperID;
    //             if(셀 공정을 시작하고 셀 공정 시작보고에 실패한 경우){
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //                 PLC의 메모리의 해당하는 필드에 "AUTO_INPUT_CELL_PROC_START_FAIL" Write
    //             }

    //             # Tray에서 배출된 셀 정보 저장(셀 Output from Tray) 
    //             var b = ((DSFPLC)Parent).BIZ_SET_TRAY_CELL_OUT_CELL(trayId, cellId);
    //             if(b가 존재할 때){
    //                 GRule 리로드하기
    //                 PLC 메모리맵의 InCellNG 필드에 "G"라는 값을 저장
    //                 tCellCurr 테이블에 cellId에 해당하는 셀의 Status를 저장한다.
    //             }
    //             else {
    //                 PLC 메모리맵의 InCellNG 필드에 "B"라는 값을 저장
    //             }

    //         }

       
    //     }
    //     else { // AutoInputBit가 0일 때
    //         PLC 메모리 맵의 InCellOk 필드에 0 값을 저장함
    //         PLC 메모리 맵의 IncellNG 필드에 0값을 저장함.
    //     }

    }
    
}
