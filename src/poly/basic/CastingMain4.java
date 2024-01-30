package poly.basic;

// 다운캐스팅 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제없음

        Parent parent2 = new Parent();
        //Child child2 = (Child) parent2; // parent2를 Child 타입으로 캐스팅 할 수 없음. 런타임오류:ClassCastException
        //child2.childMethod(); // 실행불가
    }
}
