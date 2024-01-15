package oop1;

public class ValueObject {
    int value;
    // 이 클래스에서 만든 add는 static을 사용하지 않는다.
    // 객체를 생성한다면 static을 사용할 필요가 없다.
    void add() {
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
