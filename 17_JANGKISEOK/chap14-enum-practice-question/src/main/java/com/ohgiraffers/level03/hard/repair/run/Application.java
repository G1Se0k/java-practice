package com.ohgiraffers.level03.hard.repair.run;

import com.ohgiraffers.level03.hard.repair.controller.RepairManager;
import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

public class Application {
    public static void main(String[] args) {
        // 1. 수리 4건을 RepairManager에 넣는다
        RepairManager repairManager = new RepairManager();
        repairManager.addRepair("노트북");
        repairManager.addRepair("프린터");
        repairManager.addRepair("모니터");
        repairManager.addRepair("키보드");
        // 2. 1번은 두 번, 2번은 한 번, 3번은 세 번 진행한다
        repairManager.advance(1);
        repairManager.advance(2);
        repairManager.advance(2);
        repairManager.advance(3);
        repairManager.advance(3);
        repairManager.advance(3);
        // 3. 모든 접수를 출력한다
        for(RepairDTO repair : repairManager.getRepairs()){
            System.out.println(repair);
        }
        // 4. 상태별 건수를 enum 선언 순서대로 출력한다
        System.out.println("== 상태별 건수 ==");
        System.out.println("접수 : " + repairManager.countBy(RepairStatus.RECEIVED) + "건");
        System.out.println("수리 중 : " + repairManager.countBy(RepairStatus.FIXING) + "건");
        System.out.println("완료 : " + repairManager.countBy(RepairStatus.DONE) + "건");
        // 5. 상태 이름 DONE과 CANCEL로 건수를 찾아 출력한다
        System.out.println("== 이름으로 찾기 ==");
        print(repairManager, "DONE");
        print(repairManager, "CANCEL");
    }

    private static void print(RepairManager repairManager,String label){
        try {
            System.out.println(label + " : " + repairManager.countByName(label) + "건");
        }catch (IllegalArgumentException e){
            System.out.println(label + " : 없는 상태");
        }
    }
}
