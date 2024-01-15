package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer play = new MusicPlayer();
        // 음악 플레이어 켜기
        play.on();

        // 볼륨증가
        play.volumeUp();
        play.volumeUp();

        // 볼륨감소
        play.volumeDown();

        // 상태확인
        play.showStatus();

        // 음악 플레이어 끄기
        play.off();
    }
}
