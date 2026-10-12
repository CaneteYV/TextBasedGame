package currency;
abstract class Currency {
    // PILLAR 1 - ENCAPSULATION
    private String currencyName;
    private String country;
    private double value;

    public Currency(String currencyName, String country,
                    double value) {
        this.currencyName = currencyName;
        this.country = country;
        setValue(value);
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCountry() {
        return country;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value > 0) {
            this.value = value;
        } else {
            System.out.println(
                "Invalid value! Must be greater than zero."
            );
        }
    }

    // PILLAR 4 - ABSTRACTION
    public abstract void displayInfo();
}

