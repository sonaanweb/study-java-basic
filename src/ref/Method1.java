package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();   // x001
        initStudent(student1, "학생1", 15, 90);   //x001,....

        Student student2 = new Student();   // x002
        initStudent(student2, "학생2", 16, 80);   //x002,....

        printStudent(student1);
        printStudent(student2);
    }


    static void initStudent(Student student, String name, int age, int grade){ // 참조값 받고
        student.name = name; // 인스턴스에 넘겨 온 매개변수의 값을 대입  // x001.name....
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        // 참조값 넘겨 출력
        System.out.println("이름: "+ student.name + "나이: " + student.age + "성적: " + student.grade);
    }
}

/**
 * tip : rename 단축키 shift + f6
 */

/**
 * 참조형은 메서드를 호출할 때 참조값을 전달한다. 따라서 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나 값을 읽어 사용 가능
 * initStudent(Student student....) : 전달한 학생 객체의 필드에 값을 설정한다.
 * printStudent(....): 전달한 학생 객체의 필드 값을 읽어 출력한다.
 */