package extends1.super2;

public class ClassB extends ClassA{

    // 생성자
    public ClassB(int a){
        // super(); 매개변수가 없는 기본 생성자는 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    // 생성자
    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}