package homeworks.lesson10.task2musicinstruments;

public class Main {
    public static void main(String[] args) {
        Drum drum = new Drum(50);
        Guitar guitar = new Guitar(6);
        Pipe pipe = new Pipe (15);
        Instrument [] instruments = {drum, guitar, pipe};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
