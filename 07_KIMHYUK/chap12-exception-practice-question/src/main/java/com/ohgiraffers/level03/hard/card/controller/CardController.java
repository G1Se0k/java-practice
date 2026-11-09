package com.ohgiraffers.level03.hard.card.controller;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class CardController {

    private TransitCard card;

    public CardController(TransitCard card) {
        this.card = card;
    }

    public void process(String command) {

        System.out.println("명령 : " + command);

        String[] arr = command.split(" ");

        String type = arr[0];
        String amountStr = arr[1];

        try {

            int amount = Integer.parseInt(amountStr);

            if (type.equals("충전")) {
                card.charge(amount);

            } else if (type.equals("결제")) {
                card.pay(amount);
            }

            System.out.println("처리 완료");

        } catch (NumberFormatException e) {

            System.out.println("금액은 숫자로 입력해야 합니다.");

        } catch (InvalidAmountException | InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("잔액 : " + card.getBalance() + "원");
        }
    }
}
