package final1;

public class Member {

    /**
     * 회원 이름 변경의 예시 -> id는 못 바꾸고 name은 바꿀 수 있을 때
     */
    private final String id;
    private String name;

    // 생성자
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name){
        // String id 매개변수 제거, this.id = id; 컴파일 오류
        this.name = name;
    }

    public void print(){
        System.out.println("id: " + id + ", name: " + name);
    }
}
