package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Write;

public class 투입OutTrayID업로드Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean OutTrayIdUpBit){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
        // if(OutTrayIdUpBit == 1){
        //      Tray 깨기(BIZ_SET_TRAY_CELL_OUT)
        //      현재 TrayId 조회
        //      if(현재 TrayID가 Null이면){
        //          PLC의 해당하는 필드에 "TRAY_OUTPUT_TRAY_ID_NOT_FOUND" 저장
        //      }
        //      else { 현재 TrayID가 Null이 아니면
        //          if(Usage가 없으면){
        //              PLC의 OutTrayNG 필드에 1 Write
        //              PLC의 OutTrayOK 필드에 1 Write
        //              tMstEquipMent 테이블에 trayID 저장
        //          }

        //      }
        // }
        // else { OutTrayIdUpBit == 0
        //     PLC의 OutTrayOK 필드에 0 Write
        //     PLC의 OutTrayOK 필드에 0 Write
        // }

    }
    
}
