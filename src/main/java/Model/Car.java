package Model;

public class Car {
    private String onOff;

    public void ligar(String on) {
        this.onOff = on;
    }

    public void desligar(String Off){
        this.onOff = Off;
    }

    public void buzinar(String buzinar) {
        this.onOff = buzinar;
    }

    @Override
    public String toString() {
        return " o carro esta " + onOff;
    }
}
