package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        // 배열 활용 - 같은 타입의 데이터를 나열할 수 있다 : Animal
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 동물이 추가되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}


// ctrl+alt+n (inline variable)
// ctrl+alt+m (extract Method)

/**
 * Animal 클래스 생성 문제, sound() 메서드 오버라이딩 하지 않을 경우의 문제가 남아있음
 * => 추상 메서드와 클래스로 해결해보자
 */