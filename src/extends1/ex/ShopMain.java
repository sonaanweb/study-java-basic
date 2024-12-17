package extends1.ex;

/**
 * Q. 코드의 중복이 없게 상속 관계 사용, 부모 클래스는 Item
 * 공통 속성: name, price
 *
 * 이름:JAVA, 가격:10000
 * - 저자:han, isbn:12345
 * 이름:앨범1, 가격:15000
 * - 아티스트:seo
 * 이름:영화1, 가격:18000
 * - 감독:감독1, 배우:배우1
 */
public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000,"감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}