package com.ohgiraffers.level03.hard.repair.model.dto;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;

public class RepairDTO {
    private int id;
    private String item;
    private RepairStatus status;

    public RepairDTO(int id, String item) {
        this.id = id;
        this.item = item;
        status =  RepairStatus.RECEIVED;
    }

    public int getId() {
        return id;
    }

    public RepairStatus getStatus() {
        return status;
    }

    public void advance(){
        status = status.next();
    }

    @Override
    public String toString() {
        return id + "번 " +
                item + " : " +
                status.getLabel();
    }
}
