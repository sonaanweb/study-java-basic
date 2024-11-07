package class1;

public class ClassStart5 {

    /**
     * 배열 리팩토링, 선언 최적화
     */
    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};
        // Student[] students = new Student[]{student1, student2}; 배열 선언 부호 리팩토링

        // 향상된 for문 - 값을 하나 담아 사용하는 경우
        // * iter 단축키 - for문 자동생성
        for (Student s : students){
            System.out.println("이름: " + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}




/*
1. for문
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
 */

/*
2. for문 - 반복 요소 변수에 담아 처리
        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; // 변수 생성
            System.out.println("이름: " + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
 */