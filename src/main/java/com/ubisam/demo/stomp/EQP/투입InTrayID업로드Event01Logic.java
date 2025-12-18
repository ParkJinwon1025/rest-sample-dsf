package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Write;

public class 투입InTrayID업로드Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean InTrayIdUpBit){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
        // if(InTrayIdUpBit == 1){
        //      PLC의 InTrayIDBCR Read
        //      if(InTrayIDBCR의 값이 null이면){
        //           PLC의 메모리의 해당하는 필드에 TroubleCode Write
        //      }
        //      else {  null이 아니면
        //          if(Tray의 Usage가 있으면){
        //              PLC 메모리의 InTrayNG 필드에 1 Write
        //              PLC의 메모리의 해당하는 필드에 "TRAY_INPUT_TRAY_ID_NO_USE" Write
        //              return
        //          }

        //          if(다음공정이 D가 아니고 NextOperGroupID도 1이 아니면){
        //              PLC 메모리의 InTrayNG 필드에 1 Write
        //              PLC의 메모리의 해당하는 필드에 "TRAY_INPUT_TRAY_OPERGROUP_ERROR" Write
        //              return
        //          }

        //          if(다음공정이 DSF이면 ){
        //              PLC 메모리의 InTrayNG 필드에 1 Write
        //              PLC의 메모리의 해당하는 필드에 "TRAY_INPUT_TRAY_OPERGROUP_ERROR" Write
        //              return
        //          }
        //          else { // 다음 공정이 DSF가 아니면
        //              Cell 등급확인
        //              해당 트레이의 셀 전체를 가져옴
        //              if(트레이의 셀 전체가 없을 경우){
        //                  if(셀 목록에 A등급이 아닌 등급이 있을 경우){
        //                      NG처리
        //                       break;
        //                  }
        //              }
        //              if(Cell이 NG Cell이면 ){
        //                 PLC 메모리의 InTrayNG 필드에 1 Write
        //                 PLC의 메모리의 해당하는 필드에 "TRAY_INPUT_CELL_GRADE_NG" Write
        //                 return;
        //              }
        //          }
        //          PLC 메모리의 InTrayOK 필드에 1 Write 
        //          tMstEquipmet 테이블의 TrayID 업데이트
        //          레시피 관련 필드 PLC에 Write
        //          PLC 메모리의 RecipeRedownReq 필드에 1 Write

        //     }
        //     if(공정이 Agint 공정이면){
        //          MstAgintRack 테이블에서 TrayId로 rackId 조회
        //          spSetAgingRack 테이블의 LineID, TrayID, RackID, Status, on_ret_num, os_ret_msg 필드에 값 저장
        //      }
        // }
        // else { // InTrayIdUpBit가 1일 때
        //     PLC 메모리의 InTrayOK 필드에 0 Write
        //     PLC 메모리의 InTrayNG 필드에 0 Write
        //     PLC 메모리의 recipeRedownReq 필드에 0 Write
        // }

    }
    
}
