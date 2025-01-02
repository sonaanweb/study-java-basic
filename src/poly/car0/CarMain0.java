package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();  // 생성

        driver.setK3Car(k3Car); // K3 set
        driver.drive();
    }
}
