package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1","학생3","학생4","학생5"};
        int[] age = {15,17,10,16};
        int[] grade = {90, 100, 80, 50};
        // studentsName이 배열의 크기가 age, grade 크기의 길이와 일치하다면 한번에 넣어도 된다.
        for(int i=0; i< studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + age[i] + " 성적: " + grade[i]);
        }
    }
}
