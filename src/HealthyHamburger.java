public class HealthyHamburger extends BaseHamburger{
    String addition5;
    double addition5Price;
    String addition6;
    double addition6Price;

    public HealthyHamburger(String meat) {
        super("brown roll", meat);

    }

    @Override
    public void addAddition1(String addition1, double addition1Price) {
        super.addAddition1(addition1, addition1Price);
    }

    @Override
    public void addAddition2(String addition2, double addition2Price) {
        super.addAddition2(addition2, addition2Price);
    }

    @Override
    public void addAddition3(String addition3, double addition3Price) {
        super.addAddition3(addition3, addition3Price);
    }

    @Override
    public void addAddition4(String addition4, double addition4Price) {
        super.addAddition4(addition4, addition4Price);
    }

    public void addAddition5(String addition5, double addition5Price) {
        this.addition5 = addition5;
        this.addition5Price = addition5Price;
    }

    public void addAddition6(String addition6, double addition6Price) {
        this.addition6 = addition6;
        this.addition6Price = addition6Price;
    }

    @Override
    public double calculatePrice() {
       double finalPrice = super.calculatePrice();
        if (addition5 != null){
            finalPrice += addition5Price;
            System.out.println("Added " + addition5 + " for an extra "+addition5Price);
        }

        if (addition6 != null){
            finalPrice += addition6Price;
            System.out.println("Added " + addition6 + " for an extra "+addition6Price);
        }

        return finalPrice;
    }
}
