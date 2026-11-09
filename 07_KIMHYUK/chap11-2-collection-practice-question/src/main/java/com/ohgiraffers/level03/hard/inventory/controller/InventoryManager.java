package com.ohgiraffers.level03.hard.inventory.controller;

import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.*;

public class InventoryManager {

    private List<ItemDTO> items = new ArrayList<>();

    public void addItem(ItemDTO item) {
        items.add(item);
    }

    public int removeSoldOut() {
        int count = 0;
        Iterator<ItemDTO> iterator = items.iterator();
        while (iterator.hasNext()) {
            ItemDTO item = iterator.next();
            if (item.getQuantity() == 0) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    public Map<String, Integer> sumByCategory() {
        Map<String, Integer> categorySumMap = new TreeMap<>();

        for (ItemDTO item : items) {
            String category = item.getCategory();
            int quantity = item.getQuantity();

            categorySumMap.put(category, categorySumMap.getOrDefault(category, 0) + quantity);
        }

        return categorySumMap;

    }

    public List<ItemDTO> sortedBy(Comparator<ItemDTO> c) {

        List<ItemDTO> sortedList = new ArrayList<>(items);
        sortedList.sort(c);
        return sortedList;
    }

    public List<ItemDTO> sortedByCode() {
        List<ItemDTO> sortedList = new ArrayList<>(items);

        Collections.sort(sortedList);
        return sortedList;
    }
}
