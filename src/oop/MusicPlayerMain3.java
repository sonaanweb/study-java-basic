package oop;

public class MusicPlayerMain3 {

    /**
     * 절차 지향 프로그래밍 방식 3 - 메서드 활용 모듈화
     */

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 on off
        on(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}


/*
data.isOn = true;
System.out.println("음악 플레이어 시작");
||
on(data);
 */

/**
 * 각 기능을 메서드로 만든 덕분에 모듈화가 되었다. (모듈화: 기능별 모듈 단위로 분리. 필요 시 메서드 호출)
 * 1. 중복 제거 : 로직 중복 제거. 같은 로직 필요 시 해당 메서드 여러번 호출
 * 2. 변경 영향 범위 : 기능 수정 시 해당 메서드 내부만 변경
 * 3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있음(직관적)
 */

/**
 * ! 절차 지향의 한계 발생 !
 * `데이터(MusicPlayerData)와 기능(MusicPlayerMain3)이 분리`되어 있다.
 * 데이터와 기능은 밀접히 연관되어 있다. 이 코드에선 메서드 대부분 data를 기반으로 동작한다
 * 관련 데이터가 변경이 되면 musicPlayerMain 메서드도 함께 변경해야 한다.
 * 즉, 데이터와 기능이 분리되어있으면 데이터 클래스 기능 클래스 둘 다 변경해야 한다는 것.
 * --- > 유지보수 관점에서 불편하다. --- > 객체 지향의 등장
 */