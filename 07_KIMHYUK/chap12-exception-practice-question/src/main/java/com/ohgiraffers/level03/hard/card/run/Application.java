package com.ohgiraffers.level03.hard.card.run;

import com.ohgiraffers.level03.hard.card.controller.CardController;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class Application {

    public static void main(String[] args) {

        TransitCard card = new TransitCard();

        CardController controller = new CardController(card);

        String[] commands = {"충전 5000", "결제 1450", "결제 abc", "충전 -1000", "결제 9000", "충전 10000", "결제 1450"};

        for (String command : commands) {
            controller.process(command);
        }
    }
}
