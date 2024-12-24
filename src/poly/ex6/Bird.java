package poly.ex6;

/**
 * 클래스 상속 + 인터페이스 구현
 */
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}