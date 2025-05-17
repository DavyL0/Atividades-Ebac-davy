package org.davy;

import java.util.Arrays;

/**
 * Project: md46
 * Package: org.davy
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 16/05/2025
 * Time: 21:24
 * <p>
 */
public class Fatorial {
    private static int MAX = 100;
    private static final int[] elements = new int[MAX];


    static {
        Arrays.fill(elements, -1);
        elements[0] = 1;
        elements[1] = 1;
    }

    public static int encontraElemento(int n) {
        return fatorial(n);
    }

    private static int fatorial(int n) {
        if (elements[n] != -1) {
            return  elements[n];
        }

        elements[n] = n * fatorial(n -1);
        return elements[n];
    }
}
