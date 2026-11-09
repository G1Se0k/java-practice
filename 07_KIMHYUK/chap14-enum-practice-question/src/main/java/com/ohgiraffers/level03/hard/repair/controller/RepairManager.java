package com.ohgiraffers.level03.hard.repair.controller;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    private List<RepairDTO> repairs = new ArrayList<>();
    private int nextId = 1;

    public void addRepair(String item) {
        RepairDTO repair = new RepairDTO(nextId++, item);
        repairs.add(repair);
    }

    public void advance(int id) {
        for (RepairDTO repair : repairs) {
            if (repair.getId() == id) {
                repair.advance();
                break;
            }
        }
    }

    public List<RepairDTO> getRepairs() {
        return repairs;
    }

    public int countBy(RepairStatus status) {
        int count = 0;
        for (RepairDTO repair : repairs) {
            if (repair.getStatus() == status) {
                count++;
            }
        }
        return count;
    }

    public int countByName(String statusName) {
        int count = 0;
        for (RepairDTO repair : repairs) {
            if (repair.getStatus().getLabel().equals(statusName)) {
                count++;
            }
        }
        return count;
    }
}
