public class DeluxeHamburger extends BaseHamburger{
    String defaultAddition1;
    String defaultAddition2;
    double defaultPrice1;
    double defaultPrice2;
    public DeluxeHamburger(String bread, String meat) {
        super(bread, meat);
        this.defaultAddition1 = "fries";
        this.defaultAddition2 = "coke";
        this.defaultPrice1=2;
        this.defaultPrice2=1;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.calculatePrice()+defaultPrice1+defaultPrice2;
        System.out.println("Final price is: " + finalPrice);
        return finalPrice;
    }

    @Override
    public void addAddition1(String addition1, double addition1Price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addAddition2(String addition2, double addition2Price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addAddition3(String addition3, double addition3Price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addAddition4(String addition4, double addition4Price) {
        System.out.println("Cannot add additional items");
    }
}

