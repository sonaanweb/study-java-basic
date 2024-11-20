package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println("이름: " + s.name + "나이: " + s.age + "성적: " + s.grade);
        }
    }
}


/**
 * 회원 객체를 생성하고 나면 변수에 초기값을 설정한다.
 * 객체를 제대로 사용하기 위해서는 객체를 생성하자 마자 초기값을 설정해야 할 것이다.
 * 위 코드는 설정하는 부분이 반복되므로 메서드 리팩토링을 진행하자
 */