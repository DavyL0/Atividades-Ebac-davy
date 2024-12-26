package org.example;

public class M3Factory extends BMWFactory{
    private double custo;

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    @Override
    public void criarMotor() {
        super.criarMotor();
        System.out.println("Motor M3 criado");
    }

    @Override
    public void criarCambio() {
        super.criarCambio();
        System.out.println("Cambio M3 criado");
    }
}
