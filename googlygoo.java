/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newermathclass;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ebrown2025
 */
public class NewerMathClass {
//Number 1
    public static void main(String[] args) {
    double b = (double)(Math.random() * 91);
        //esablishes the variable b as a random number between 0-90
      System.out.println("the random numer is " + b);
      System.out.println("sin equals:" + roundAvoid(Math.sin(b), 3));
      System.out.println("cos equals:" + roundAvoid(Math.cos(b), 3));
      System.out.println("tan equals:" + roundAvoid(Math.tan(b), 3));
      //finds the value of the random number indicated
      
      
     
    //Number 2
    Random generator = new Random();
    
      double d = 21.0;
      
      double c = generator.nextDouble(d);
      //this finds a random variable from 20-0
      double Circle = Math.PI * c * c;
      
      System.out.println("The radius of a circle is " + roundAvoid(c, 3) );
      System.out.println("The area of a circle is " + roundAvoid(Circle, 3));
      
      
      
    // Number 3
    
      
    double E = generator.nextDouble(99999999.0) + 1000.0;
    // this establishes the variable E as a random number between 1000 and 100,000,000
    System.out.println("the random integer is: " + roundAvoid(E, 5) );
    double Eroot = Math.sqrt(E);
    //this sqaures E
    System.out.println("the square  root is: " + roundAvoid(Eroot, 5) );
    double Eln = Math.log(E);
    //this finds the log base of E
    System.out.println("the natural logarithim is: " + roundAvoid(Eln, 5) );
    double Elog10 = Math.log10(E);
    //this finds the log base of 10 for E
    System.out.println("the log base of 10 is: " + roundAvoid(Elog10, 5) );
    
    
    
    //Number 4
     double light = 299792458;
    double lbb = light*light;
    double mass = E/lbb;
    //divides the pre established variable of E by the speed of light squared
    
    System.out.println("the mass need to generate " + E + " of energy is " + roundAvoid(mass, 10) + "g");
    
    
    //Number 5
    Scanner lilguy = new Scanner (System.in);
    //creates a new scanner
    System.out.println( "give me a real number");
        String strIn = "";
        double rint = lilguy.nextDouble();
    System.out.println( "give me a random integer");
        String strInner = "";
    double rumber = lilguy.nextDouble();
    //this prints reads the inner variable and converts it into a double
    double sum = Math.pow(rumber,rint );
    //this uses the integer as a exponent and the number as the base number
    System.out.println( " Heres that number to the power of that integer " + roundAvoid(sum, 10));
      }     
public static double roundAvoid(double value, int places) {
double scale = Math.pow(10, places);
return Math.round(value * scale) / scale;
}
      
    }


