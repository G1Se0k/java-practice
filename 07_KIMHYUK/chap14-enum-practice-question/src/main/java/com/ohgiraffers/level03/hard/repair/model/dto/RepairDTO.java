package com.ohgiraffers.level03.hard.repair.model.dto;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;

public class RepairDTO {

    private int id;
    private String item;
    private RepairStatus status;

    public RepairDTO(int id, String item) {
        this.id = id;
        this.item = item;
        this.status = RepairStatus.RECEIVED;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public RepairStatus getStatus() {
        return status;
    }

    public void advance() {
        this.status = this.status.next();
    }

    @Override
    public String toString() {
        return "RepairDTO{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", status=" + status +
                '}';
    }
}
