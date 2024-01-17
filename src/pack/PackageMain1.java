package pack;

import pack.Data;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지 내에서는 경로를 생략해도 된다.
        pack.a.User user = new pack.a.User(); // 패키지 전체 경로를 포함해서 클래스를 적어주자.
    }
}
