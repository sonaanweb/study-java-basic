package oop;

public class MusicPlayerMain1 {

    /**
     * 절차 지향 프로그래밍 방식 1
     */

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 on off
        isOn = true;
        System.out.println("음악 플레이어 시작");

        // 볼륨 증가
        volume ++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        // 볼륨 증가
        volume ++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        // 볼륨 감소
        volume --;
        System.out.println("음악 플레이어 볼륨: " + volume);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}

// 점진적으로 코드 순서에 따라 실행