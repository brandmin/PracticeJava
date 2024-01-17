package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        // 같은 클래스 이름이 있다면 import는 둘 중 하나 선택 가능. 나머지는 패키지 경로 포함해서 작성
        pack.b.User userB = new pack.b.User();
    }
}
