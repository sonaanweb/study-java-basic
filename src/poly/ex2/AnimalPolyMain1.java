package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog); // Animal animal = dog...
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal){
                        //Animal은 dog,cat,cow의 부모이므로 담을 수 있다
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
