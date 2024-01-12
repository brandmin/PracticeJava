package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 새 데이터를 생성하면 참조값이 생김
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException 발생
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
