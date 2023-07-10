public class Main {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos){System.out.println(pos);}
    void stop(){}
}