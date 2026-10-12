package currency;
class DollarBills extends Currency {
    private String billDesign;

    public DollarBills(double value, String billDesign) {
        super("US Dollar", "United States", value);
        this.billDesign = billDesign;
    }

    @Override
    public void displayInfo() {
        System.out.println("Currency: " + getCurrencyName());
        System.out.println("Country: " + getCountry());
        System.out.println("Value: $ " + getValue());
        System.out.println("Bill design: " + billDesign);
        System.out.println("--------------------");
    }
}

