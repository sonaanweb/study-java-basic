package oop.ex;

public class Rectangle {

    int width;
    int height;

    // 넓이
    int calculateArea() {
        return width * height;
    }

    // 둘레
    int calculatePerimeter() {
        return 2 * (width + height);
    }

    // 정사각형 여부
    boolean isSquare() {
        return width == height;
    }
}

// 매개변수 필요 없음 = 내 것 쓰는 거니까 ! (객체 지향)