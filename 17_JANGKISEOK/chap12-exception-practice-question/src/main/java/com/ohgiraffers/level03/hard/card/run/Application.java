package com.ohgiraffers.level03.hard.card.run;

import com.ohgiraffers.level03.hard.card.controller.CardController;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class Application {
    public static void main(String[] args) {
        // 1. 잔액 0원인 TransitCard와 CardController를 만든다
        TransitCard card = new TransitCard();
        CardController cardController = new CardController(card);
        // 2. 처리할 명령 배열을 만든다
        String[] commands = new String[]{"충전 5000", "결제 1450", "결제 abc", "충전 -1000", "결제 9000", "충전 10000", "결제 1450"};
        // 3. 명령을 하나씩 처리한다
        for(String command : commands){
            cardController.process(command);
        }
    }
}
