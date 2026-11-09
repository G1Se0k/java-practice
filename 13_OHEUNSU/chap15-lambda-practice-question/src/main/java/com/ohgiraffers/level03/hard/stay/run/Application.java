package com.ohgiraffers.level03.hard.stay.run;

import com.ohgiraffers.level03.hard.stay.controller.StayManager;
import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {

        StayManager stayManager = new StayManager();
        Consumer<StayDTO> printer = System.out::println;

        stayManager.addStay(new StayDTO("바다뷰 펜션", "강릉", 120000, 4));
        stayManager.addStay(new StayDTO("숲속 오두막", "평창", 95000, 5));
        stayManager.addStay(new StayDTO("시티 호텔", "서울", 150000, 3));
        stayManager.addStay(new StayDTO("한옥 스테이", "전주", 110000, 5));
        stayManager.addStay(new StayDTO("호숫가 캠핑", "평창", 70000, 4));

        System.out.println("[평창 숙소]");
        stayManager.printAll(stayManager.search(stay -> stay.getRegion().equals("평창")), printer);
        System.out.println("[10만 원 이하, 별점 4 이상]");
        stayManager.printAll(stayManager.search(stay -> (stay.getPrice() < 100000 && stay.getRating() >= 4)), printer);
        System.out.println("[제주 숙소]");
        stayManager.printAll(stayManager.search(stay -> stay.getRegion().equals("제주")), printer);

        System.out.println("할인 적용 : " + stayManager.changePrice(stay -> stay.getRating() == 5, price -> (price * 9) / 10) + "건");

        System.out.println("[가격 낮은 순]");
        stayManager.sortedList((stay1, stay2) -> stay1.getPrice() - stay2.getPrice()).forEach(printer);
    }
}
