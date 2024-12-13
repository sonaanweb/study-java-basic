package access.b;   // b 패키지

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {

        // public 다른 패키지 호출 가능
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
        // DefaultClass....
    }
}
