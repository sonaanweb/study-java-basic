package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 10
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}

/**
 * 1. 메서드 호출
 * int a = 10 선언
 * changePrimitive(int x){} 메서드 호출 - a에 있는 값 10을 복사해서 10을 전달 x=10
 * 메서드 안에서 x = 20으로 새로운 값 대입, 결과적으로 x의 값만 20으로 변경되고 a에는 영향X
 * 2. 메서드 종료 = 매개변수 x는 메모리상에서 제거됨
 */