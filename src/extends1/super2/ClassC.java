package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10,20); // 기본 생성자 없을 시 직접 정의해줘야 함(ClassB)
        System.out.println("ClassC 생성자");
    }
}