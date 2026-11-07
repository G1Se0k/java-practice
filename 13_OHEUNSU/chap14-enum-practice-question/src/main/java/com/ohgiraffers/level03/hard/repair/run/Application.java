package com.ohgiraffers.level03.hard.repair.run;

import com.ohgiraffers.level03.hard.repair.controller.RepairManager;
import com.ohgiraffers.level03.hard.repair.model.RepairStatus;

public class Application {

    public static void main(String[] args) {

        RepairManager repairManager = new RepairManager();

        repairManager.addRepair("노트북");
        repairManager.addRepair("프린터");
        repairManager.addRepair("모니터");
        repairManager.addRepair("키보드");
        repairManager.advance(1);
        repairManager.advance(1);
        repairManager.advance(2);
        repairManager.advance(3);
        repairManager.advance(3);
        repairManager.advance(3);
        repairManager.getRepairs().forEach(System.out::println);
        System.out.println("== 상태별 건수 ==");
        for(RepairStatus status: RepairStatus.values()){
            System.out.println(status.getLabel() + " : " + repairManager.countBy(status) + "건");
        }
        System.out.println("== 이름으로 찾기 ==");

        String[] names = {"DONE", "CANCEL"};

        for (String name: names) {
            try {
                System.out.println(name + " : " + repairManager.countByName(name) + "건");
            } catch (IllegalArgumentException e) {
                System.out.println(name + " : 없는 상태");
            }
        }
    }
}
