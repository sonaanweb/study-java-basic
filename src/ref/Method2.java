package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15,90);
        Student student2 = createStudent("학생2", 16,80);

        printStudent(student1);
        printStudent(student2);
    }

    // 생성 메서드
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();    // x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;     //x001
    }

    static void printStudent(Student student){
        System.out.println("이름:"+ student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}


/**
 * 생성 메서드 만들고 객체를 생성하는 부분도 이 메서드 안에 함께 포함. 하나의 객체의 생성과 초기값 설정을 모두 처리
 * 메서드는 호출 결과를 반환(return)할 수 있다. 메서드의 반환 기능을 사용해 만들어진 객체의 참조값을 메서드 밖으로 반환하면 된다.
 */