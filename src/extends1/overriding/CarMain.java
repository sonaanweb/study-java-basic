package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 전기차를 빠르게 이동합니다 -> electricCar에서 시작

        GasCar gasCar = new GasCar();
        gasCar.move(); // 차를 이동합니다

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
    }
}