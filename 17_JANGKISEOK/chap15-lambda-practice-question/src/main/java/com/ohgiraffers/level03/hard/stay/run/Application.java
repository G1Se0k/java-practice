package com.ohgiraffers.level03.hard.stay.run;

import com.ohgiraffers.level03.hard.stay.controller.StayManager;
import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        // 1. 숙소 5개를 StayManager에 넣는다
        StayManager stayManager = new StayManager();
        stayManager.addStay(new StayDTO("바다뷰 펜션", "강릉", 120000, 4));
        stayManager.addStay(new StayDTO("숲속 오두막", "평창", 95000, 5));
        stayManager.addStay(new StayDTO("시티 호텔", "서울", 1500000, 3));
        stayManager.addStay(new StayDTO("한옥 스테이", "전주", 110000, 5));
        stayManager.addStay(new StayDTO("호숫가 캠핑", "평창", 70000, 4));
        // 2. 지역이 평창인 숙소를 검색해 출력한다
        System.out.println("[평창 숙소]");
        stayManager.search(dto -> dto.getRegion().equals("평창")).forEach(System.out::println);
        // 3. 가격이 100000원 이하이고 별점이 4 이상인 숙소를 검색해 출력한다
        System.out.println("[10만원 이하, 별점 4점 이상]");
        stayManager.search(dto -> dto.getPrice() <= 100000 && dto.getRating() >= 4).forEach(System.out::println);
        // 4. 지역이 제주인 숙소를 검색해 출력한다
        System.out.println("[제주 숙소]");
        stayManager.printAll(stayManager.search(dto->dto.getRegion().equals("제주")),System.out::println);
        // 5. 별점이 5인 숙소에 10% 할인을 적용하고 바꾼 건수를 출력한다
        int count = stayManager.changePrice(dto -> dto.getRating() == 5, price-> (int)(price * 0.9f));
        System.out.println("할인 적용 : " + count + "건");

        // 6. 가격이 낮은 순으로 정렬한 목록을 출력한다

        stayManager.sortedList(Comparator.comparingInt(StayDTO::getPrice)).forEach(System.out::println);
    }
}
