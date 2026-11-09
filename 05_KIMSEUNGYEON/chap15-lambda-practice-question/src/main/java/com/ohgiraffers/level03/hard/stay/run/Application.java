package com.ohgiraffers.level03.hard.stay.run;

import com.ohgiraffers.level03.hard.stay.controller.StayManager;
import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        StayManager manager = new StayManager();

        // 1. 숙소 5개를 StayManager에 넣는다
        manager.addStay(new StayDTO("바다뷰 펜션", "강릉", 120000, 4));
        manager.addStay(new StayDTO("숲속 오두막", "평창", 95000, 5));
        manager.addStay(new StayDTO("시티 호텔", "서울", 150000, 3));
        manager.addStay(new StayDTO("한옥 스테이", "전주", 110000, 5));
        manager.addStay(new StayDTO("호숫가 캠핑", "평창", 70000, 4));

        // 2. 지역이 평창인 숙소를 검색해 출력한다
        System.out.println("[평창 숙소]");
        List<StayDTO> pyeongchang = manager.search(stay -> stay.getRegion().equals("평창"));
        manager.printAll(pyeongchang, System.out::println);

        // 3. 가격이 100000원 이하이고 별점이 4 이상인 숙소를 검색해 출력한다
        System.out.println("[10만 원 이하, 별점 4 이상]");

        List<StayDTO> cheap =
                manager.search(
                        stay -> stay.getPrice() <= 100000
                                && stay.getRating() >= 4
                );

        manager.printAll(cheap, System.out::println);

        // 4. 지역이 제주인 숙소를 검색해 출력한다
        System.out.println("[제주 숙소]");
        List<StayDTO> jeju = manager.search(stay -> stay.getRegion().equals("제주"));
        manager.printAll(jeju, System.out::println);

        // 5. 별점이 5인 숙소에 10% 할인을 적용하고 바꾼 건수를 출력한다
        int count = manager.changePrice(
                stay -> stay.getRating() == 5,
                price -> price - price * 10 / 100
        );

        System.out.println("할인 적용 : " + count + "건");

        // 6. 가격이 낮은 순으로 정렬한 목록을 출력한다
        System.out.println("[가격 낮은 순]");
        List<StayDTO> sorted = manager.sortedList(
                (s1, s2) ->
                        Integer.compare(s1.getPrice(), s2.getPrice()));
        manager.printAll(sorted, System.out::println);
    }
}