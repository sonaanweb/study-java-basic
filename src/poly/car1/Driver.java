package poly.car1;

public class Driver {

    private Car car; // 자동차 역할에만 의존

    public void setCar(Car car){
        System.out.println("자동차 설정: " + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
