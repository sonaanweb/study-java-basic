package access.a;

/**
 * 같은 패키지
 */
public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가 - AccessData 내부에서만 접근 가능

        // public 메서드 호출 가능 - 외부 호출(ㅇ)
        // innerAccess()는 외부에서 호출되었지만, 메서드 자체는 AccessData에 포함
        data.innerAccess();
    }
}

