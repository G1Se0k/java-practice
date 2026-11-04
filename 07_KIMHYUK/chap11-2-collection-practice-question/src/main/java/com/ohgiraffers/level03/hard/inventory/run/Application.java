package com.ohgiraffers.level03.hard.inventory.run;

import com.ohgiraffers.level03.hard.inventory.controller.InventoryManager;
import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addItem(new ItemDTO("P101", "무선 마우스", "전자", 25000, 10));
        manager.addItem(new ItemDTO("P102", "볼펜", "문구", 1000, 0));
        manager.addItem(new ItemDTO("P103", "키보드", "전자", 45000, 5));
        manager.addItem(new ItemDTO("P104", "노트", "문구", 3000, 50));
        manager.addItem(new ItemDTO("P105", "수건", "생활", 8000, 20));
        manager.addItem(new ItemDTO("P106", "지우개", "문구", 500, 0));

        int removedCount = manager.removeSoldOut();
        System.out.println("품절 삭제 : " + removedCount + "개");

        System.out.println("== 코드순 ==");
        for (ItemDTO item : manager.sortedByCode()) {
            System.out.println(item);
        }

        System.out.println("== 가격 높은 순 ==");

        List<ItemDTO> sortedByPriceDesc = manager.sortedBy(new Comparator<ItemDTO>() {
            @Override
            public int compare(ItemDTO o1, ItemDTO o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        for (ItemDTO item : sortedByPriceDesc) {
            System.out.println(item);
        }

        System.out.println("== 이름순 ==");

        List<ItemDTO> sortedByName = manager.sortedBy(new Comparator<ItemDTO>() {
            @Override
            public int compare(ItemDTO o1, ItemDTO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (ItemDTO item : sortedByName) {
            System.out.println(item);
        }


        System.out.println("== 분류별 재고 ==");
        Map<String, Integer> sumMap = manager.sumByCategory();
        for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "개");
        }
    }
}