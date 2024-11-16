package oop.ex;

/**
 * 변경 코드 (객체 지향)
 */
public class RectangleOopMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();   // 위에 설정해둔 w,h 사용
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

}

// `객체`에게 묻고, 답을 듣는 것이다.