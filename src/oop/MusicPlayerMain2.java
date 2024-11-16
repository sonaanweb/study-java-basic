package oop;

public class MusicPlayerMain2 {

    /**
     * 절차 지향 프로그래밍 방식 2 - 데이터 묶음 [MusicPlayerData 클래스 생성]
     */

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 on off
        data.isOn = true;
        System.out.println("음악 플레이어 시작");

        // 볼륨 증가
        data.volume ++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        // 볼륨 증가
        data.volume ++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        // 볼륨 감소
        data.volume --;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}

// f2 - 다음오류 코드로 이동
// 앞서 배웠듯 클래스 내에 속성들을 추가하고 제거하는 것은 클래스 내에서 해주면 되므로 간편해진다.