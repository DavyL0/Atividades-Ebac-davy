package org.davy;

import java.util.Arrays;

/**
 * Project: md46
 * Package: org.davy
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 17/05/2025
 * Time: 09:15
 * <p>
 */
public class Fibonacci {
    private static int MAX = 100;
    private static final int[] elements = new int[MAX];

    static {
        Arrays.fill(elements, -1);
    }
    public static int encontraElemento(int n) {

        return fibi(n);
    }

    private static int fibi(int n) {
        if (elements[n] == -1) {
            if(n <= 1){
                return  elements[n];
            }else {
            elements[n] = fibi(n -1) + fibi(n -2);

            }
        }
        return elements[n];

    }
}
