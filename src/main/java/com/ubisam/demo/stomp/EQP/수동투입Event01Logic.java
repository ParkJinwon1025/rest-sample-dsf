package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Read;
import lombok.Locked.Write;

public class 수동투입Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean HandInputBit){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
    //     if(HandInputBit == 1){
    //        PLC 메모리맵의 HandInputCellIDBCR 필드에서 값을 Read하여 cellID라는 변수에 넣음. 
    //        cellID 변수의 널 문자와 앞 뒤 공백을 제거한다.
           
    //        if(cellID에 값이 존재할 경우){
    //             rsCell이라는 변수에 cellID라는 ID를 가진 현재 셀 정보를 Read해서 넣음.

    //             if(rsCell이 null이 null일 경우){
    //                 PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                 PLC의 메모리의 해당하는 필드에 "HAND_INPUT_CELL_ID_NOT_FOUND" Write
    //                 return;
    //             }

    //             trayId라는 변수에 rsCell의 TrayID 값을 넣고 앞뒤 공백을 제거함.
    //             if(trayId가 null이거나 값이 없을 때){
    //                 PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                 PLC의 메모리의 해당하는 필드에 "HAND_INPUT_TRAY_INFORMATION_ERROR" Write
    //                 return;
    //             }

    //             rs 변수에, 비어있지 않고 trayId 값을 갖는 현재 트레이 정보를 읽어서 저장한다.
    //             if(rs가 null이면){
    //                 PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                 PLC의 메모리의 해당하는 필드에 "HAND_INPUT_TRAY_ID_NOT_FOUND" Write
    //                 return;
    //             }

    //             else { rs가 null이 아닐 경우

    //                 if(Grade값이 비어있지 않고 Grade값에 A가 포함되지 않은 경우){
    //                     PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                     PLC의 메모리의 해당하는 필드에 "HAND_INPUT_CELL_GRADE_NG" Write
    //                     return;
    //                 }

    //                 if(rs 변수의 usage가 N이 아닐 경우){
    //                     PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                     PLC의 메모리의 해당하는 필드에 "HAND_INPUT_TRAY_ID_NO_USE" Write
    //                     return;
    //                 }

    //                 rsCell의 NextOperGroupID를 int형으로 변환해서 nogId라는 이름의 변수에 저장함.
    //                 if(다음장비타입이 D가 아니거나 nogId가 2보다 작을 경우){
    //                     PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                     PLC의 메모리의 해당하는 필드에 "HAND_INPUT_TRAY_OPERGROUP_ERROR" Write
    //                     return;
    //                 }

    //                 sp를 통해 RecipeBody를 Read해서 recipeBody라는 변수에 저장한다.
    //                 if(recipeBody가 비어있거나 null인 경우){
    //                     PLC 메모리맵의 HandInputOK 필드에 2라는 값을 Write
    //                     PLC의 메모리의 해당하는 필드에 "HAND_INPUT_TRAY_OPERGROUP_ERROR" Write
    //                     return;
    //                 }
    //                 PLC 메모리맵의 Recipe에 해당하는 필드에 값을 Write
    //                 PLC 메모리맵의 RecipeRedownReq에 1을 Write
    //                 if(현재 장비 타입ID가  Aging이고 현재 작업 그룹ID가 Aging인 경우) {
    //                     TrayId를 기준으로 RackID를 가져와서 rackId라는 이름의 변수에 저장한다.
    //                     출고중 상태를 spSegAgingRack라는 프로시저를 이용하여 저장함. 
    //                     출고 완료 상태를 spSegAgingRack라는 프로시저를 이용하여 저장함. 
    //                 }

    //                 inOperID = rsCell.NextOperGroupID + rsCell.NextOperID;
    //                 if(셀 공정을 시작하고 셀 공정 시작보고에 실패한 경우){
    //                     PLC 메모리맵의 HandInputOK 필드에 "2"라는 값을 저장
    //                     PLC의 메모리의 해당하는 필드에 "HAND_INPUT_CELL_PROC_START_FAIL" Write
    //                 }

    //                 # Tray에서 배출된 셀 정보 저장(셀 Output from Tray) 
    //                 var b = ((DSFPLC)Parent).BIZ_SET_TRAY_CELL_OUT_CELL(trayId, cellId);
    //                 if(b가 존재할 때){
    //                     GRule 리로드하기
    //                     투입 트레이 정보를 spSetCellMove2라는 프로시저를 통해 저장함.
    //                     현재 셀 상태를 tCellCurr라는 테이블에 저장함. 
    //                     PLC 메모리맵의 HandInputOK 필드에 "1"라는 값을 저장
    //                 }
    //                 else {
    //                     PLC 메모리맵의 HandInputOK 필드에 "2"라는 값을 저장
    //                 }

    //             }
    //        }
       
    //     }
    //     else { // HandInputBit 0일 때
    //         PLC 메모리맵의 HandInputOK 필드에 "0"라는 값을 저장
    //     }

    }
    
}
