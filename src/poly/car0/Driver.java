package poly.car0;

public class Driver {

    private K3Car k3Car;    // 참조형 생성 기본 초기 null값

    public void setK3Car(K3Car k3Car){  // 외부에서 k3Car 받아 올 수 있음
        this.k3Car = k3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다");
        k3Car.startEngine();
        k3Car.pressAccelerator();
        k3Car.offEngine();
    }
}
