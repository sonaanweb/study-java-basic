package poly.ex6;

public class Dog extends AbstractAnimal{

    @Override
    public void sound() {   //추상은 구현
        System.out.println("멍멍");
    }
}
