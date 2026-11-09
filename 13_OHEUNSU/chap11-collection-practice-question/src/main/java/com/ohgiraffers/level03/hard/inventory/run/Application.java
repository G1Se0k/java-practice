package com.ohgiraffers.level03.hard.inventory.run;

import com.ohgiraffers.level03.hard.inventory.controller.InventoryManager;
import com.ohgiraffers.level03.hard.inventory.model.comparator.NameAscending;
import com.ohgiraffers.level03.hard.inventory.model.comparator.PriceDescending;
import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        InventoryManager im = new InventoryManager();

        im.addItem(new ItemDTO("P104", "노트", "문구", 3000, 50));
        im.addItem(new ItemDTO("P101", "무선 마우스", "전자", 25000, 10));
        im.addItem(new ItemDTO("P106", "볼펜", "문구", 1500, 0));
        im.addItem(new ItemDTO("P103", "키보드", "전자", 45000, 5));
        im.addItem(new ItemDTO("P102", "텀블러", "생활", 18000, 0));
        im.addItem(new ItemDTO("P105", "수건", "생활", 8000, 20));

        int cnt = im.removeSoldOut();
        System.out.println("품절 삭제 : " + cnt + "개");

        List<ItemDTO> codeList = im.sortedByCode();
        List<ItemDTO> priceList = im.sortedBy(new PriceDescending());
        List<ItemDTO> nameList = im.sortedBy(new NameAscending());

        System.out.println("== 코드순 ==");
        for(ItemDTO item: codeList) System.out.println(item);
        System.out.println("== 가격 높은 순 ==");
        for(ItemDTO item: priceList) System.out.println(item);
        System.out.println("== 이름순 ==");
        for(ItemDTO item: nameList) System.out.println(item);

        System.out.println("== 분류별 재고 ==");
        Map<String, Integer> sbc = im.sumByCategory();
        for(String category: sbc.keySet()){
            System.out.println(category + " : " + sbc.get(category) + "개");
        }

    }
}
