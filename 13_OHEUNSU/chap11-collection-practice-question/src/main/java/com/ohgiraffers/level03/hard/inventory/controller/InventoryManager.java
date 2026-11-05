package com.ohgiraffers.level03.hard.inventory.controller;

import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.*;

public class InventoryManager {

    private List<ItemDTO> items;

    {
        items = new ArrayList<>();
    }

    public void addItem(ItemDTO item){
        items.add(item);
    }

    public int removeSoldOut(){
        int cnt = 0;
        Iterator<ItemDTO> iterator = items.iterator();

        while(iterator.hasNext()){
            ItemDTO item = iterator.next();
            if(item.getQuantity() == 0){
                cnt++;
                iterator.remove();
            }
        }
        return cnt;
    }

    public Map<String, Integer> sumByCategory(){

        Map<String, Integer> resMap = new TreeMap<>();

        for(ItemDTO item: items){
            if(resMap.containsKey(item.getCategory())) resMap.put(item.getCategory(), resMap.get(item.getCategory()) + item.getQuantity());
            else resMap.put(item.getCategory(), item.getQuantity());
        }
        return resMap;
    }

    public List<ItemDTO> sortedBy(Comparator<ItemDTO> c){
        List<ItemDTO> sortedList = new ArrayList<>();
        sortedList.addAll(items);
        sortedList.sort(c);
        return sortedList;
    }

    public List<ItemDTO> sortedByCode(){
        List<ItemDTO> sortedList = new ArrayList<>();
        sortedList.addAll(items);
        Collections.sort(sortedList);
        return sortedList;
    }
}
