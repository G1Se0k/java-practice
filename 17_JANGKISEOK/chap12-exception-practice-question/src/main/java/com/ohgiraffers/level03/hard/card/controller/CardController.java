package com.ohgiraffers.level03.hard.card.controller;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

import java.util.StringTokenizer;

public class CardController {
    private TransitCard card;

    public CardController(TransitCard card) {
        this.card = card;
    }

    public void process(String command){
        System.out.println("명령 : " + command);
        StringTokenizer st = new StringTokenizer(command);
        String commandCase = st.nextToken();
        String amount = st.nextToken();
        try {
            switch (commandCase){
                case "충전" : card.charge(Integer.parseInt(amount)); break;
                case "결제" : card.pay(Integer.parseInt(amount)); break;
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
