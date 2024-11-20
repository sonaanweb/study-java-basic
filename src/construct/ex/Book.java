package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    // 기본 생성자
    Book(){
        this("","",0);  // null 방지 ""
    }

    // title과 author만을 매개변수로 받는 생성자
    Book(String title, String author){
        this(title, author, 0); // 중복 코드 제거
    }

    // 모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + title +", 저자: " + author + ", 페이지: " + page);
    }
}


/**
 * 정리: 중복 코드를 제거하기 위해 this(); 를 사용하면 가장 포괄적인 생성자를 기반으로 사용하게 된다
 */