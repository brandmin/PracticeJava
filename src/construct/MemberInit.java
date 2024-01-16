package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; // 멤버 변수의 데이터를 넣고 싶을때 앞에 this사용.
        this.age = age;
        this.grade = grade;
    }
}
