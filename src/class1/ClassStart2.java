package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        /**
         * 1. 같은 데이터 타입 배열로 정리
         */
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름: "+ studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }
    }

    // 그러나 한 학생의 데이터가 세개의 변수에 나눠져있다. 데이터 변경, 추가, 삭제 시 복잡해진다.
    // 사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것이다. 그리고 각각의 학생 별로 본인의 이름 나이 성적을 관리하는 것이다.
}
