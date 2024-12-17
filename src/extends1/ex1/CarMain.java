package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

/**
 * `자동차`라는 추상적인 상위 개념을 적용시켰을 때
 * 공통개념 -> '이동' -> 상속 개념 사용하는 것이 효과적
 */