package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가 - 자기 자신의 것이므로 객체 생성 제거
    // this --> 자기 자신의 인스턴스 (MemberInit 변수들) 가르킴
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

/**
 * initMember()는 member에 초기값 설정 기능을 제공하는 메서드
 * 메서드를 호출하면 객체의 멤버 변수에 `인자로 넘어온 값`을 채운다
 */

/**
 * this
 *
 * 멤버 변수와 메서드의 매개변수의 [이름이 같을 때 ]어떻게 구분하는가?
 * 멤버 변수보다 매개변수(initMember 변수들)의 코드 블럭이 더 안쪽에 존재하기때문에 우선순위 차지
 * 멤버 변수에 접근하려면 앞에 this. 를 붙여주면 된다.
 *
 *  진행과정
 *  this.name = name; // 1. 오른쪽 name 매개변수에 접근
 *  this.name = "user" // 2. name 매개변수의 값 사용
 *  x001.name = "user" // 3. this = 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스 멤버 변수에 접근
 */