package com.newthinktank.designpatterns.structural.l21proxy;

public interface ATMState {
    
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
    
}
