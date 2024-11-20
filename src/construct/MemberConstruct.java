package construct;

/**
 * 생성자 도입
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 - 생성자 오버로딩 (생성자 두개 이상)
    // 성적 입력이 꼭 필요한 경우 grade가 있는 생성자 호출, 그렇지 않은 경우 없는 생성자 호출
    MemberConstruct(String name, int age){
        this(name, age,50);     // 첫번째 생성자 내부에서 두번째 생성자 호출
        /* this.name = name;
        this.age = age;
        this.grade = 50;    // 성적 안 넣으면 기본값이 50
        */
    }

    // 생성자
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

/**
 * 생성자는 메서드와 비슷하지만
 * 생성자 : 대문자로 시작, 반환타입이 없음
 */

/**
 * this() 규칙
 * - 생성자 코드 `첫줄`에만 작성 가능
 */