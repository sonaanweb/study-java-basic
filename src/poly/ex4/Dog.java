package poly.ex4;

public class Dog extends AbstractAnimal {

    // 불완전한 메서드를 자식이 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
