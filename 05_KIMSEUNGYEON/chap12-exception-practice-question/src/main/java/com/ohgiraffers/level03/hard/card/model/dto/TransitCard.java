package com.ohgiraffers.level03.hard.card.model.dto;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;

public class TransitCard {

    private int balance;

    public TransitCard() {
    }

    public void charge(int amount) {
        if(amount < 0) {
            throw new InvalidAmountException("금액은 0보다 커야 합니다 : " + amount);
        } else {
            balance = balance + amount;
            System.out.println("처리 완료");
        }
    }

    public void pay(int fare) throws InsufficientBalanceException{
        if(fare < 0) {
            throw new InvalidAmountException("금액은 0보다 커야 합니다 : " + fare);
        }

        if(balance < fare) {
            throw new InsufficientBalanceException("잔액이 부족합니다. 결제 금액: " + fare);
        } else {
            balance = balance - fare;
            System.out.println("처리 완료");
        }
    }

    public int getBalance() {
        return balance;
    }
}
