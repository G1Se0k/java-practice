package com.ohgiraffers.level03.hard.repair.run;

import com.ohgiraffers.level03.hard.repair.controller.RepairManager;
import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

public class Application {

    public static void main(String[] args) {

        RepairManager manager = new RepairManager();

        manager.addRepair("노트북");
        manager.addRepair("프린터");
        manager.addRepair("모니터");
        manager.addRepair("키보드");

        manager.advance(1);
        manager.advance(1);

        manager.advance(2);

        manager.advance(3);
        manager.advance(3);
        manager.advance(3);

        for (RepairDTO repair : manager.getRepairs()) {
            System.out.println(repair.getId() + "번 " + repair.getItem() + " : " + repair.getStatus().getLabel());
        }

        System.out.println("== 상태별 건수 ==");
        for (RepairStatus status : RepairStatus.values()) {
            System.out.println(status.getLabel() + " : " + manager.countBy(status) + "건");
        }

        System.out.println("== 이름으로 찾기 ==");
        String[] searchNames = {"DONE", "CANCEL"};

        for (String statusName : searchNames) {
            boolean exists = false;

            for (RepairStatus status : RepairStatus.values()) {
                if (status.name().equals(statusName)) {
                    exists = true;
                    
                    System.out.println(statusName + " : " + manager.countByName(status.getLabel()) + "건");
                    break;
                }
            }

            if (!exists) {
                System.out.println(statusName + " : 없는 상태");
            }
        }
    }
}
