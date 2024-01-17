package pack;

import pack.a.*; // 하나의 패키지에 여러개가 들어있을 경우 *를 사용한다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지 내에서는 경로를 생략해도 된다.
        User user = new User(); // 임포트를 선언하면 위 코드처럼 변경이 가능하다.
        User2 user2 = new User2();
    }
}
