package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 배열 활용 - 같은 타입의 데이터를 나열할 수 있다 : Animal
        Animal[] animalArr = {dog, cat, cow};

        // 변하지 않는 코드
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
