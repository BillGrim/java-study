package com.billgrim.basic.controlStatement.conditionalStatement;

import javax.swing.*;

/**
 * Created by Bill_Grim on 2017/5/4.
 */
public class SwitchCase {
    public static void main(String[] args) {
        String intString = JOptionPane.showInputDialog("Enter an integer");
        int number = Integer.parseInt(intString);
        switch (number) {
            case 1:
                System.out.println("Input number is 1 .");
                break;
            case 2:
                System.out.println("Input number is 2 .");
                break;
            case 3:
                System.out.println("Input number is 3 .");
                break;
            default:
                System.out.println("Input number is not 1, 2 or 3 .");
                break;
        }
    }
}
