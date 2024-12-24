package poly.ex1;

/**
 * 다형성 적용 전 코드 - 새로운 동물이 추가될 때마다 코드의 중복이 많아짐
 * 중복 제거 시도 (메서드, 배열) 불가한 이유 = dog,cat,cow가 현재 서로 다른 타입이기 때문
 */
public class AnimalSoundMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}