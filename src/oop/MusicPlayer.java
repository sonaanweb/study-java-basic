package oop;


/**
 * 객체 지향 디테일
 */
public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;
    
    void on(){          //자기 자신의 데이터를 쓰기 때문에 외부 data를 받을 필요가 없다 ()
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다");
    }
    
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨 ON, 볼륨: " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 ON, 볼륨: " + volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

/**
 * 이제 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 음악 플레이어를 생성해 사용할 수 있다.
 * 음악 플레이어를 사용하는데 필요한 모든 속성과 기능이 하나의 클래스에 포함됐다.
 */