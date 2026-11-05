package com.ohgiraffers.level03.hard.inventory.model.comparator;

import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.Comparator;

public class NameAscending implements Comparator<ItemDTO> {

    @Override
    public int compare(ItemDTO o1, ItemDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
