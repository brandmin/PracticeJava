package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // 기본 생성자는 값을 생략할 수 있지만, 개발자가 직접 정의하였다면 값을 입력해야함.
        System.out.println("ClassC 생성자");
    }
}
