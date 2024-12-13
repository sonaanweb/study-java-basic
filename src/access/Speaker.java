package access;

/**
 * 음량 10씩 증가, 최대 음량 100, up&down 메서드
 */
public class Speaker {

    private int volume;     // 필드, 접근제어자 private 사용

    Speaker(int volume){    // volume 받는 생성자
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 더이상 증가시킬 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
