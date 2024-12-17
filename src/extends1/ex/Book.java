package extends1.ex;

public class Book extends Item{

    private String author;
    private String isbn;

    // book 생성자
    public Book(String name, int price, String author, String isbn) {
        super(name, price); // 공통 필드 부모 호출 super
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {   // ctrl+o Override Select
        super.print(); // 부모 메서드 출력 - 필드값 접근은 private이므로 불가
        System.out.println("- 저자:" + author + ", isbn: " + isbn);
    }
}
