package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);   // 부모는 자식을 받을 수 있다
        driver.drive();

        // 차량 변경(K3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);   // model3 인스턴스로 변경
        driver.drive();

        // 차량 변경(model3 -> NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
