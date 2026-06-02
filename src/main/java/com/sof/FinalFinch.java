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

    Scanner input = new Scanner(System.in);
    
    // Starting text
    System.out.println("Welcome to my NLP app!");
    System.out.println("1. Option 1");
    System.out.println("2. Option 2");
    String userInput = input.nextLine(); // collect userInput
    
    // Logic for userInput
    if (userInput.equals("1")) {
      System.out.println("Option 1 selected");
      // add code here for option 1
      
    } else if (userInput.equals("2")) {
      System.out.println("Option 2 selected");
      // add code here for option 2
      
    } else {
      // Error Handling
      System.out.println("\nSorry, I dont understand that."); 
      System.out.println("Please restart, and only choose option 1 or 2"); 
    }
}