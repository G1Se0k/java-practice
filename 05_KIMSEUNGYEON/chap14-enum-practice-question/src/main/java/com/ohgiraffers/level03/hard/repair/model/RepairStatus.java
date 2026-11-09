package com.ohgiraffers.level03.hard.repair.model;

public enum RepairStatus {

    RECEIVED("접수"),
    FIXING("수리 중"),
    DONE("완료");

    private final String label;

    RepairStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public RepairStatus next() {

        RepairStatus[] statuses = RepairStatus.values();

        if (this.ordinal() == statuses.length - 1) {
            return this;
        }

        return statuses[this.ordinal() + 1];
    }
}