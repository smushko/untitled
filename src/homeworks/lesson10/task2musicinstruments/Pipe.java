package homeworks.lesson10.task2musicinstruments;

public class Pipe implements Instrument {
    private int diametr;

    public Pipe(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pipe pipe = (Pipe) o;

        return diametr == pipe.diametr;
    }

    @Override
    public String toString() {
        return "Pipe{" +
                "diametr=" + diametr +
                '}';
    }

    @Override
    public int hashCode() {
        return diametr;
    }

    @Override
    public void play (){
        System.out.println("Играет труба c диаметром: " + getDiametr());
    }
}
