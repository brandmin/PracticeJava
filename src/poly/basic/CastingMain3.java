package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        // 업캐스팅
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅 생략가능. 생략 권장
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}