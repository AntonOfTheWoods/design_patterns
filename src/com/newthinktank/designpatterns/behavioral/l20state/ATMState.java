package com.newthinktank.designpatterns.behavioral.l20state;

public interface ATMState {
    
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
    
}
