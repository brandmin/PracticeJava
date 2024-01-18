package access.ex;

public class Counter {
    private int count = 0;
    private int max;

    public Counter() {}

    public Counter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
