package access;

public class Speaker {
    private int volume; // 접근제어자를 설정하면 이 클래스 내에서만 volume 조정가능

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
