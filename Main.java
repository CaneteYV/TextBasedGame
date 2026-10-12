package currency;
public class Main {
    public static void main(String[] args) {

        // Parent-type array: POLYMORPHISM
        Currency[] money = {
            new PesoBills(100, "100-peso bill"),
            new PesoBills(500, "500-peso bill"),
            new DollarBills(20, "20-dollar bill"),
            new DollarBills(100, "100-dollar bill")
        };

        for (Currency c : money) {
            c.displayInfo();
        }

        // LIVE ENCAPSULATION TEST
        System.out.println("ENCAPSULATION TEST");

        Currency sample =
            new PesoBills(100, "100-peso bill");

        System.out.println(
            "Before: PHP " + sample.getValue()
        );

        sample.setValue(50);

        System.out.println(
            "After: PHP " + sample.getValue()
        );
    }
}