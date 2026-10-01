package task4_sum;

public class Money {
    private double amount;
    private String currency;

    public Money(double amount, String currency) {
        this.amount   = amount;
        this.currency = currency;
    }

    public double getAmount()    { return amount; }
    public String getCurrency()  { return currency; }

    @Override
    public String toString() {
        return String.format("Money{amount=%.2f, currency='%s'}", amount, currency);
    }
}
