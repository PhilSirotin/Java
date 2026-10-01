package task3_random_gen;

public class Ticket {
    private int number;
    private String series;

    public Ticket(int number, String series) {
        this.number = number;
        this.series = series;
    }

    public int getNumber()    { return number; }
    public String getSeries() { return series; }

    @Override
    public String toString() {
        return "Ticket{series='" + series + "', number=" + number + "}";
    }
}
