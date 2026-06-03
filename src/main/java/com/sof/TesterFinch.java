package com.sof; 

 

public class TesterFinch{
    public static void main (String[] args){
        FinalFinch bird = new FinalFinch("A");

        bird.setBeak(0, 100, 0);

        bird.askInput();

        bird.stopAll();
        bird.disconnect();
    }
    
}



































