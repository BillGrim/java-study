package com.billgrim.basic.controlStatement.conditionalStatement;

import javax.swing.*;

/**
 * Created by Bill_Grim on 2017/5/4.
 */
public class IfElse {
    public static void main(String[] args) {
        String intString = JOptionPane.showInputDialog("Enter an integer");
        int number = Integer.parseInt(intString);
        if (number % 2 == 0)
            System.out.println("Input is even.");
        else
            System.out.println("Input is odd.");

        if (number == 1)
            System.out.println("Input is 1 .");
        else if (number == 2)
            System.out.println("Input is 2 .");
        else if (number == 3)
            System.out.println("Input is 3 .");
        else
            System.out.println("Input is not 1, 2 or 3 .");

        if (number > 0) {
            System.out.println("Input is greater to 0 .");
            if (number < 10)
                System.out.println("Input is lower to 10 .");
        } else {
            System.out.println("Input is lower to 0 .");
        }

        System.out.println("Input is " + number);

    }
}
