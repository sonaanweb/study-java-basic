package extends1.ex;

public class Album extends Item{

    private String artist;

    // Album 생성자
    public Album(String name, int price, String artist) {
        super(name, price); // 공통 필드 부모 호출 super
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
