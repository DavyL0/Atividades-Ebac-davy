package org.example;

public class Main {
    public static void main(String[] args) {
        Carro golf = new Carro();

        golf.setPorta(true);
        golf.setMotor("v8");

        golf.portaAberta();
        golf.ligaCarro();
    }
}