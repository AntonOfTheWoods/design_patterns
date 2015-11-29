package com.newthinktank.designpatterns.behavioral.l12command;

public class TVRemote {
    
    public static ElectronicDevice getDevice(){
        
        return new Television();
        
    }
    
}
