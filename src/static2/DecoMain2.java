package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);    //클래스로 바로 찾아감

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}

/**
 * 객체를 계속 생성해봐야 달라지는 게 없으므로 static 사용
 * 클래스 메서드 - static(+)
 * 인스턴스 메서드 - 인스턴스 생성해야만 호출 가능
 */