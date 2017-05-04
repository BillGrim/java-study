package com.billgrim.basic.controlStatement.loopStatement;

/**
 * Created by Bill_Grim on 2017/5/4.
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            --i;
        } while (i > 0);
    }
}
