package com.sof;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

   public FinalFinch(String device){
        super(device);
    }

    public void drawPentagon() {
        for (int i = 0; i < 5; i++) {
            setMove("F", 5, 50);
            setTurn("L", 72, 50);
        }
    }

    
}