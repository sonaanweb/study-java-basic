package construct;

/**
 * 필드명 멤버변수와 매개변수 값이 다른 경우는 this 생략되어있는 것
 */
public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
    }
}

/**
 * nameField는 먼저 지역변수(매개변수)에서 같은 이름이 있는 지 찾고, 없으면 멤버 변수에서 찾음
 * nameParameter는 지역변수(매개변수)에서 같은 이름이 있는 지 찾고, 있으므로 매개변수 사용
 */