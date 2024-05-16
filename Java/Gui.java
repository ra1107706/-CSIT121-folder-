package com.boostmytool;
import javax.swing.JOptionPane;
public class Gui {


    public static void main (String[] args){
// the beginning and the end\\
String Jacob;

        String jacob = JOptionPane.showInputDialog ("What is your first name?");
        JOptionPane.showInputDialog("Your name is " +jacob);

int age = Integer.parseInt(JOptionPane.showInputDialog("Next what is your age?"));
        JOptionPane.showInputDialog("Your age is " +age);

        double heightnow = Double.parseDouble(JOptionPane.showInputDialog("Lastly what is your height?"));
        JOptionPane.showInputDialog("Your height is "+heightnow);

        float Ken = Float.parseFloat(JOptionPane.showInputDialog("What yah rep"));
        JOptionPane.showInputDialog("Your height is "+Ken);

    }

}
