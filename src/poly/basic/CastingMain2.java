package poly.basic;

// 업 캐스팅 VS 다운 캐스팅
public class CastingMain2 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child;
//      ||
        Parent parent2 = child; // 업캐스팅은 생략 가능 (권장 코드)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
