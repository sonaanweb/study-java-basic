package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        // 객체를 생성하는 동시에 생성자 호출
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16,80);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}

/**
 * new 생성자(클래스)이름(인수 목록)
 */

/**
 * 생성자의 장점
 * - 중복 호출 제거 (메서드 직접 호출 제거)
 * - 생성자 호출 필수이므로 정보 없는 데이터를 잡아줌
 */