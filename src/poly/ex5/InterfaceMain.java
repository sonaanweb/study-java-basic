package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {

        // 인터페이스 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

    }

        private static void soundAnimal(InterfaceAnimal animal) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
}

/**
 * 클래스, 추상 클래스, 인터페이스는 모두 같다. 제약이 조금씩 추가될 뿐이다.
 */