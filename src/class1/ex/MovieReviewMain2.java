package class1.ex;


/**
 * 배열 도입 문제 풀이
 * 객체 생성 후 배열에 객체 선언과 동시에 추가(선언 동시 초기화)
 */
public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "인셉션";
        review1.review = "인생은 무한루프";

        MovieReview review2 = new MovieReview();
        review2.title = "어바웃 타임";
        review2.review = "인생 시간 영화!";

        // 배열 선언
        MovieReview[] movieReviews = {review1, review2};

        for (MovieReview r : movieReviews) {
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }
    }
}
