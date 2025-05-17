package org.davy;

/**
 * Project: Default (Template) Project
 * Package: org.davy
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 16/05/2025
 * Time: 21:23
 * <p>
 */
public class Main {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        Fibonacci fibonacci = new Fibonacci();
        int n1 = 3;
        int n2 = 5;

        System.out.println("Fatorial : " +Fatorial.encontraElemento(n1)
        +" " + Fatorial.encontraElemento(n2));

        System.out.println("Fibonacci : "+ Fibonacci.encontraElemento(n1));
    }
}