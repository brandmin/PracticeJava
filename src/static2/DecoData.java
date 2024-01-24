package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue; // 클래스 소속

    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근, Complie Error
        //instanceMethod(); // 인스턴스 메서드 접근, Complie Error
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근(private이고 클래스 내부에서 접근가능)
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
