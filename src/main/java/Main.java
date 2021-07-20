import Model.Car;

public class Main {

    public static void main(String[] args) {

        Car redCar = new Car();
        redCar.ligar("ligado");
        System.out.println(redCar);
        redCar.desligar("desligado");
        System.out.println(redCar);
        redCar.buzinar("buzinando");
        System.out.println(redCar);
    }
}
