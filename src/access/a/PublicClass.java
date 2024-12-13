package access.a;

public class PublicClass {  // public Class

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}

class DefaultClass2{

}

// public 접근 제어자 클래스
/**
 * 파일명과 클래스의 이름이 반드시 같아야 한다. 이 클래스는 public이기 때문에 외부에서 접근할 수 있다.
 * Default 접근제어자 -> 같은 패키지 내부에서만 접근 가능
 * public 클래스는 파일 당 하나만 존재할 수 있다.
 */