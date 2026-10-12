package currency;
// PILLAR 2 - INHERITANCE
class PesoBills extends Currency {
    private String billDesign;

    public PesoBills(double value, String billDesign) {
        super("Philippine Peso", "Philippines", value);
        this.billDesign = billDesign;
    }

    // PILLAR 3 - POLYMORPHISM
    @Override
    public void displayInfo() {
        System.out.println("Currency: " + getCurrencyName());
        System.out.println("Country: " + getCountry());
        System.out.println("Value: PHP " + getValue());
        System.out.println("Bill design: " + billDesign);
        System.out.println("--------------------");
    }
}
