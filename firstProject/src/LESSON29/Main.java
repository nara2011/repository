package LESSON29;
public class Main {
    public static void main(String[] args) {
        Instrument[] ins = new Instrument[2];
        ins[0] = new Guitar();
        ins[1] = new Piano();
        ins[0].playSound();
        ins[1].playSound();
    }
}
