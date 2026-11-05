package com.ohgiraffers.level03.hard.inventory.model.comparator;

import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.Comparator;

public class PriceDescending implements Comparator<ItemDTO> {

    @Override
    public int compare(ItemDTO o1, ItemDTO o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
