/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ebrown2025
 */
import java.awt.*;
import javax.swing.*;

public class Main extends JPanel{
public Main(){
super();
}
public void paintComponent(Graphics g){
g.drawString("Hello World!", 200, 150);
g.drawString("--  The Machine", 190, 170);
g.drawOval(140, 40, 60, 60);
g.drawOval(150, 60, 10, 10);
g.drawLine(170, 105, 150, 140);
g.drawLine(170, 105, 190, 140);
g.drawOval(180, 60, 10, 10);
g.drawLine(170, 100, 170, 180);
g.drawLine(170, 180, 150, 210);
g.drawLine(170, 180, 190, 210);


}
public static void main(String arg[]){
JFrame frame = new JFrame("BasicJPanel");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
Main panel = new Main();

frame.setContentPane(panel);
frame.setVisible(true);
}
}