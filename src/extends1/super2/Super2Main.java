package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}

 /**
 * ClassA 생성자
 * ClassB 생성자 a = 10, b = 20
 * ClassC 생성자
 *
 * C -> B -> A(최상위 부모 클래스) 상속
  * 실행 순서는 최상위 부모부터 하나씩 아래로 내려가는 순서
  * = 자식 메서드 첫줄에서 부모 생성자 호출하기 때문
  * 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super(...)를 호출해야한다.
 */