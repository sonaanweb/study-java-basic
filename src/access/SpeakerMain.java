package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

/*
        // 필드에 직접 접근해 수정
        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume(); // 200이 출력됨

*/
    }
}

/**
 * Speaker 필드에 private 접근제어자를 사용하지 않을 시 사용자가 필드에 직접 접근하여 값을 변경할 수 있게 된다.
 * 때문에 음량 100초과 시 예외처리 했던 코드 개발의 의미가 없어지므로, private 접근 제어자를 사용해 외부 접근을 막아 방지할 수 있다.
 */