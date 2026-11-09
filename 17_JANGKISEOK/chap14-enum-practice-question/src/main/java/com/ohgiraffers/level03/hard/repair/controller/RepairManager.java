package com.ohgiraffers.level03.hard.repair.controller;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {
    private List<RepairDTO> repairs;

    public RepairManager(){
        repairs = new ArrayList<>();
    }

    public void addRepair(String item){
        int id;
        if (repairs.isEmpty()) id = 1;
        else id = repairs.getLast().getId() + 1;
        repairs.add(new RepairDTO(id,item));
    }
    public void advance(int id){
        for(RepairDTO repair : repairs){
            if(repair.getId() == id) {
                repair.advance();
                break;
            }
        }
    }

    public List<RepairDTO> getRepairs() {
        return repairs;
    }
    public int countBy(RepairStatus status){
        int count = 0;
        for(RepairDTO repair : repairs){
            if (repair.getStatus() == status){
                count++;
            }
        }
        return count;
    }
    public int countByName(String statusName) throws IllegalArgumentException{
        return countBy(RepairStatus.valueOf(statusName));
    }
}
