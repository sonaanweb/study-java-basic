package oop;

/**
 * 객체 지향
 */
public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer(); // 생성 객체 사용
        // 음악 플레이어 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}

/**
 * 필요 기능만 호출! 필요한 모든 것은 MusicPlayer에 들어있다.
 */

/**
 * 캡슐화 : 속성과 기능을 하나로 묶어 필요한 기능을 메서드를 통해 외부에 제공하는 것
 * MusicPlayer 내부 코드가 변하는 경우 `다른 외부 코드를 변경하지 않아도 된다`. (유지보수 쉬워짐)
 * 물론 내부 메서드 `이름 변경 시에는 변경`
 */