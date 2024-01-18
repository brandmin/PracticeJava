package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 내 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가. private을 선언한 클래스에서만 접근이 가능하다.
        // data.privateField = 3;

        data.innerAccess(); // innerAccess은 public으로 선언하였기 때문에 세 필드 값을 호출할 수 있다.
    }
}
