package pack;
// import pack.a.*; a패키지 안 모든 것 가져다 씀
import pack.a.User;
public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 활용
    }
}
