package poly.car0;

public class Driver {

    private K3Car k3Car;    // 참조형 생성 기본 초기 null 값
    private Model3Car model3Car; // 타입이 달라서 추가해야함

    public void setK3Car(K3Car k3Car){  // 외부에서 k3Car 받아 올 수 있음
        this.k3Car = k3Car;
    }

    // 추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    // 추가
    public void drive(){
        System.out.println("자동차를 운전합니다");
        if(k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}

// set 메서드 생성 단축키