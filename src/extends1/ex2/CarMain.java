package extends1.ex2;

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
 * 1. 기능 호출 시 호출하는 변수의 타입(클래스)기준으로 선택하고 시작
 * 2. 자식 클래스에 해당 기능이 없으면 부모 타입으로 올라가 탐색 후 호출
 * 3. 부모에서도 해당 기능이 없으면 상위 부모에서 필요한 기능을 더 찾아본다
 */