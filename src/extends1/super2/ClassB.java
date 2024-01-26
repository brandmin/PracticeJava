package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 0); // 기본 생성자 생략 가능 // 값을 부여하고 싶다면 super 대신 this를 적자.
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
