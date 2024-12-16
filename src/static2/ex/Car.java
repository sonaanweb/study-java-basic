package static2.ex;

public class Car {
    public String name;
    public static int totalCars;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() { // static 변수만 사용하므로 static으로 만들면 좋음
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
