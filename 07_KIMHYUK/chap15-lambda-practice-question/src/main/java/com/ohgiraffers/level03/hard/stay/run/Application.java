package com.ohgiraffers.level03.hard.stay.run;

import com.ohgiraffers.level03.hard.stay.controller.StayManager;
import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {


        StayManager manager = new StayManager();


        manager.addStay(new StayDTO("바다뷰 펜션", "강릉", 120000, 4));
        manager.addStay(new StayDTO("숲속 오두막", "평창", 95000, 5));
        manager.addStay(new StayDTO("시티 호텔", "서울", 150000, 3));
        manager.addStay(new StayDTO("한옥 스테이", "전주", 110000, 5));
        manager.addStay(new StayDTO("호숫가 캠핑", "평창", 70000, 4));


        System.out.println("[평창 숙소]");

        List<StayDTO> pyeongchang = manager.search(
                stay -> stay.getRegion().equals("평창")
        );

        manager.printAll(pyeongchang, stay ->
                System.out.println(stay.getName() + "(" + stay.getRegion() + ") "
                        + stay.getPrice() + "원 별점 " + stay.getRating())
        );


        System.out.println("[10만 원 이하, 별점 4 이상]");

        List<StayDTO> condition = manager.search(
                stay -> stay.getPrice() <= 100000 && stay.getRating() >= 4
        );

        manager.printAll(condition, stay ->
                System.out.println(stay.getName() + "(" + stay.getRegion() + ") "
                        + stay.getPrice() + "원 별점 " + stay.getRating())
        );


        System.out.println("[제주 숙소]");

        List<StayDTO> jeju = manager.search(
                stay -> stay.getRegion().equals("제주")
        );

        if (jeju.isEmpty()) {
            System.out.println("검색 결과 없음");
        } else {
            manager.printAll(jeju, stay ->
                    System.out.println(stay.getName() + "(" + stay.getRegion() + ") "
                            + stay.getPrice() + "원 별점 " + stay.getRating())
            );
        }


        int count = manager.changePrice(
                stay -> stay.getRating() == 5,
                price -> (int)(price * 0.9)
        );

        System.out.println("할인 적용 : " + count + "건");


        System.out.println("[가격 낮은 순]");

        List<StayDTO> sorted = manager.sortedList(
                Comparator.comparingInt(StayDTO::getPrice)
        );

        manager.printAll(sorted, stay ->
                System.out.println(stay.getName() + "(" + stay.getRegion() + ") "
                        + stay.getPrice() + "원 별점 " + stay.getRating())
        );

    }
}
