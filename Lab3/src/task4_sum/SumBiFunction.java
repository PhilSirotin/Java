package task4_sum;

import java.util.function.BiFunction;

public class SumBiFunction {
    public static void main(String[] args) {
        BiFunction<Money, Money, Money> addMoney = (a, b) -> {
            if (!a.getCurrency().equals(b.getCurrency())) {
                throw new IllegalArgumentException(
                    "Нельзя складывать разные валюты: " + a.getCurrency() + " и " + b.getCurrency());
            }
            return new Money(a.getAmount() + b.getAmount(), a.getCurrency());
        };

        System.out.println("=== Сложение денег (BiFunction<Money, Money, Money>) ===");

        Money a = new Money(100.50, "RUB");
        Money b = new Money(250.75, "RUB");
        System.out.println(a + " + " + b + " = " + addMoney.apply(a, b));

        Money c = new Money(5.00, "USD");
        Money d = new Money(3.99, "USD");
        System.out.println(c + " + " + d + " = " + addMoney.apply(c, d));

        Money e = new Money(0.00, "EUR");
        Money f = new Money(999.99, "EUR");
        System.out.println(e + " + " + f + " = " + addMoney.apply(e, f));
    }
}
