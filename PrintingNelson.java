/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printingnelson;

/**
 *
 * @author ebrown2025
 */
public class PrintingNelson {

    public static void main(String[] args) {
        String strName = ("Everett Brown");
        //defining my name as a string
        
        System.out.println("My name is \"" + strName + "\"");
        //this will print my name by itself
        
        System.out.println("My name length is \"" + strName.length() + "\"");
        //this will count the length of my name
        
        System.out.println("My name in lowercase is \"" + strName.toLowerCase() + "\"");
        //the command toLowerCase turns the capitals into lowercase when attached to the string variable
        
        System.out.println("The first letter in my name is \"" + strName.charAt(0) + "\"");
        //char.At looks for the specific character at the point assigned 
         System.out.println("The last letter in my name is \"" + strName.charAt(12) + "\"");
         //same for this
          System.out.println("The index of the space between my names is \"" + strName.indexOf(" ") + "\"");
    }
}
