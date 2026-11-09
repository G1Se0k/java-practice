package com.ohgiraffers.level03.hard.repair.controller;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    private List<RepairDTO> repairs;

    {
        repairs = new ArrayList<>();
    }

    public void addRepair(String item) {
        RepairDTO repair = new RepairDTO(repairs.size() + 1, item);
        repairs.add(repair);
    }

    public void advance(int id) {
        repairs.get(id - 1).advance();
    }

    public List<RepairDTO> getRepairs() {
        return repairs;
    }

    public int countBy(RepairStatus status) {
        int cnt = 0;
        return (int) repairs.stream().filter(repair -> repair.getStatus() == status).count();
    }

    public int countByName(String statusName) {
        return countBy(RepairStatus.valueOf(statusName));
    }
}
