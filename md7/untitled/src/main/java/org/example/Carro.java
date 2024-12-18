package org.example;

public class Carro {
    private String motor;
    private String freio;
    private Boolean porta;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFreio() {
        return freio;
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }

    public Boolean getPorta() {
        return porta;
    }

    public void setPorta(Boolean porta) {
        this.porta = porta;
    }


    public void portaAberta(){
        if (getPorta()){
            System.out.println("A porta está aberta");
        }else{
            System.out.println("A porta está fechada");
        }
    }

    public void ligaCarro(){
        if (getMotor() != null){
            System.out.println("O carro está ligado");
        }
    }
}
