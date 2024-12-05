package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}

/**
 * 서로 다른 패키지 속 클래스 이름이 겹칠 때는 하나만 import 선택해야함
 * import되지 않은 클래스는 전체 경로를 적어주어야 한다.
 * => 실무에서 겹칠 경우 자주 사용되는 클래스를 import해줌
 */