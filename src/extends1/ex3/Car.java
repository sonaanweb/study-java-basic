package extends1.ex3;

/**
 * 부모 클래스
 */
public class Car {

    public void move(){
        System.out.println("차를 이동합니다");
    }

    // 공통 추가 기능 -> 부모클래스에만 추가하면 된다
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}