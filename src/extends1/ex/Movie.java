package extends1.ex;

public class Movie extends Item{

    private String director;
    private String actor;

    // Movie 생성자
    public Movie(String name, int price, String director, String actor) {
        super(name, price); // 공통 필드 부모 호출 super
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}
