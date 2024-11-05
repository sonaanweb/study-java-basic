package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // Student 클래스 내 정보를 담을 변수 선언
        student1 = new Student(); // 실제 메모리에 담는다
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름: " + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}

/**
 * 타입: 데이터의 종류나 형태
 * 사용자가 직접 정의하는 사용자 정의 타입을 만들기위해선 설계도가 필요한데 이 설계도가 `클래스`다.
 * 설계도인 클래스를 사용해 실제 메모리에 만들어진 실체를 `객체` `인스턴스`라고 한다.
 * 클래스를 통해 사용자가 원하는 종류의 데이터 타입을 정의할 수 있다.
 *
 * --- 용어 정리 ---
 * 클래스: 설계도
 * 객체/인스턴스: 설계도를 기반으로 `실제 메모리`에 만들어진 객체
 * 위 예시에서는 `학생 클래스`를 기반으로 `학생1,2 객체/인스턴스`를 만든 것이다.
 * ----------------
 *
 * new 키워드를 통해 객체가 생성되고 나면 참조값을 반환한다. x001(주소)...
 * 앞서 선언한 변수에 의해 생성된 객체의 참조값을 보관
 * 따라서, 이 변수를 통해 객체를 접근(참조)할 수 있다.
 *
 * 참조값을 변수에 보관해야하는 이유?
 * new 키워드는 단순히 클래스를 기반으로 메모리에 실제 객체를 만들기만 하는 것이다.
 * 따라서 생성한 객체에 접근할 수 있는 방법이 필요하므로, 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다.
 * 이 보관된 참조값을 통해 실제 메모리에 존재하는 객체에 접근할 수 있게 된다.
 */
