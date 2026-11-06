package com.ohgiraffers.level03.hard.repair.run;

import com.ohgiraffers.level03.hard.repair.controller.RepairManager;
import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

public class Application {

    public static void main(String[] args) {

        RepairManager manager = new RepairManager();

        // 1. 수리 4건 접수
        manager.addRepair("노트북");
        manager.addRepair("프린터");
        manager.addRepair("모니터");
        manager.addRepair("키보드");

        // 2. 상태 진행
        manager.advance(1);
        manager.advance(1);

        manager.advance(2);

        manager.advance(3);
        manager.advance(3);
        manager.advance(3);

        // 3. 모든 접수 출력
        for (RepairDTO repair : manager.getRepairs()) {
            System.out.println(repair);
        }

        // 4. 상태별 건수 출력
        System.out.println("== 상태별 건수 ==");

        for (RepairStatus status : RepairStatus.values()) {
            System.out.println(status.getLabel() + " : " + manager.countBy(status) + "건");
        }

        // 5. 상태 이름으로 검색
        System.out.println("== 이름으로 찾기 ==");

        String[] names = {"DONE", "CANCEL"};

        for (String name : names) {

            try {
                System.out.println(name + " : " + manager.countByName(name) + "건");
            } catch (IllegalArgumentException e) {
                System.out.println(name + " : 없는 상태");
            }
        }
    }
}