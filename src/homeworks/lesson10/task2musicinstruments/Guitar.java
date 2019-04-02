package homeworks.lesson10.task2musicinstruments;

public class Guitar implements Instrument {
    private int quantityString;

    public Guitar(int quantityString) {
        this.quantityString = quantityString;
    }

    public int getQuantityString() {
        return quantityString;
    }

    public void setQuantityString(int quantityString) {
        this.quantityString = quantityString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return quantityString == guitar.quantityString;
    }

    @Override
    public int hashCode() {
        return quantityString;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "quantityString=" + quantityString +
                '}';
    }

    @Override
    public void play (){
        System.out.println("Играет гитара с кличеством струн: " + getQuantityString());
    }
}
