/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomscanner;

/**
 *
 * @author ebrown2025
 */

import java.util.Scanner;

import java.util.Random;
        
public class RandomScanner {

    public static void main(String[] args) {
        
        Random generator = new Random();
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        int num8;
        int num9;
        int num10;
        //estblishes the variables I'm gonna use
        num1 = generator.nextInt(8);
        //makes the variable generate as an integer between 0-8
        num2 = generator.nextInt(8);
      num3 = generator.nextInt(8); 
      num4 = generator.nextInt(9);
      //makes the variable generate as an integer between 0-10 this time
      num5 = generator.nextInt(10);
      num6 = generator.nextInt(10);
      num7 = generator.nextInt(10);
      num8 = generator.nextInt(10);
      num9 = generator.nextInt(10);
      num10 = generator.nextInt(10);
      
      
      
      System.out.print(" random phone number: " + num1);
      System.out.print( + num2);
      System.out.print( + num3);
      System.out.print("-" + num4);
      System.out.print( num5);
      System.out.print( num6);
      System.out.print("-" + num7);
      System.out.print(num8);
      System.out.print(num9);
      System.out.print(num10);
      //prints out the individual integer so numbers don't stack
      
    }
}
