package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b); // a, b 10

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}

/**
 * a와 b는 따로라는 것이 포인트
 * 즉 int b = a 라고 했을 때 변수에 들어있는 값을 복사해서 전달하는 점
 * 따라서 a = 20, b = 30 일 때 본인의 값만 변경되는 것을 확인
 * >> `a 자체가 b가 되는 게 아니다.`
 */