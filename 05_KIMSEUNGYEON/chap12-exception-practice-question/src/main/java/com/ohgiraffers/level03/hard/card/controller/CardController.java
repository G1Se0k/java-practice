package com.ohgiraffers.level03.hard.card.controller;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class CardController {

    private TransitCard card;

    public CardController(TransitCard card) {
        this.card = card;
    }

    public void process(String commend) {
        System.out.println("명령 : " + commend);

        String[] commends = commend.split(" ");

        try {
            String order = commends[0];
            int amount = Integer.parseInt(commends[1]);
            switch (order) {
                case "충전" :
                    card.charge(amount);
                    break;
                case "결제" :
                    card.pay(amount);
                    break;
            }

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("금액은 숫자로 입력해야 합니다.");
        } finally {
            System.out.println("잔액 : " + card.getBalance() + "원");
        }
    }
}
