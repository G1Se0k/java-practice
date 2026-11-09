package com.ohgiraffers.level03.hard.card.model.dto;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;

public class TransitCard {
    private int balance;

    public TransitCard() {
        balance = 0;
    }

    public void charge(int amount){
        if(amount <= 0) throw new InvalidAmountException("금액은 0보다 커야합니다:" + amount);
        balance += amount;
    }
    public void pay(int fare) throws InsufficientBalanceException {
        if(balance <= 0) throw new InvalidAmountException("금액은 0보다 커야합니다:" + fare);
        if(balance < fare) throw new InsufficientBalanceException("잔액이 부족합니다. 경제 금액: " + fare);
        balance -= fare;
    }
    public int getBalance(){
        return balance;
    }

}
