package org.example;

public class M5Factory extends BMWFactory{
    private Boolean turbo;
    private double valor;

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void criarCambio() {
        super.criarCambio();
        System.out.println("cambio M5 criado");
    }

    @Override
    public void criarMotor() {
        super.criarMotor();
        System.out.println("motor M5 criado");
    }
}
