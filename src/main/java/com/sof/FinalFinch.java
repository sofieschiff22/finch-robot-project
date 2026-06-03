package com.sof;

import java.util.Scanner;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

   public FinalFinch(String device){
        super(device);
    }

    public void askInput() {
      Scanner input = new Scanner(System.in);
    
      // Starting text
      System.out.println("Welcome to my Robot Shape Drawer");
      System.out.println("1. Pentagon");
      System.out.println("2. Square");
      System.out.println("3. Rectangle");
      String userInput = input.nextLine(); // collect userInput
      
      // Logic for userInput
      if (userInput.equals("1")) {
        System.out.println("Pentagon");
        drawPentagon();
      } else if (userInput.equals("2")) {
        System.out.println("Square");
        drawSquare();
      } else if (userInput.equals("3")) {
        System.out.println("Rectangle");
        drawRectangle();
      }else {
        // Error Handling
        System.out.println("\nSorry, I dont understand that."); 
        System.out.println("Please restart, and only choose square, pentagon, or rectangle");
      }
  }

    
    public void drawSquare() {
      for (int i = 0; i < 4; i++) {
          setMove("F", 5, 50);
          setTurn("L", 90, 50);
      }
    }

    public void drawPentagon() {
      for (int i = 0; i < 5; i++) {
          setMove("F", 5, 50);
          setTurn("L", 72, 50);
      }
    }

  public void drawRectangle() {
      for (int i = 0; i < 1; i++) {
          setMove("F", 10, 50);
          setTurn("L", 90, 50);
          setMove("F", 5, 50);
          setTurn("L", 90, 50);
          setMove("F", 10, 50);
          setTurn("L", 90, 50);
          setMove("F", 5, 50);



      }
    }
}