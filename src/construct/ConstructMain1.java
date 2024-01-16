package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 즉, 메모리에 먼저 생성해서 값을 호출하고 member1 인스턴스에 대입한다.
        MemberConstruct member1 = new MemberConstruct("user1",15,90); // 괄호에 생성자 객체를 불러와라.
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
