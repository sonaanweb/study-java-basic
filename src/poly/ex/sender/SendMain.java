package poly.ex.sender;

/**
 * 요구사항: 다형성 활용, Sender 인터페이스 활용, email sms facebook 구현
 */
public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for(Sender sender : senders){
            sender.sendMessage("환영합니다");
        }
    }
}
