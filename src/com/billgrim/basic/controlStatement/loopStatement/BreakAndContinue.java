package com.billgrim.basic.controlStatement.loopStatement;

/**
 * Created by Bill_Grim on 2017/5/4.
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            if (i == 5) break;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
