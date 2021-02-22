public class BaseHamburger {
    String bread;
    String meat;
    String addition1;
    String addition2;
    String addition3;
    String addition4;
    final static double basePrice = 5.0;
    double addition1Price;
    double addition2Price;
    double addition3Price;
    double addition4Price;


    public BaseHamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public void addAddition1(String addition1, double addition1Price) {
        this.addition1 = addition1;
        this.addition1Price = addition1Price;
    }

    public void addAddition2(String addition2, double addition2Price) {
        this.addition2 = addition2;
        this.addition2Price = addition2Price;
    }

    public void addAddition3(String addition3, double addition3Price) {
        this.addition3 = addition3;
        this.addition3Price = addition3Price;
    }

    public void addAddition4(String addition4, double addition4Price) {
        this.addition4 = addition4;
        this.addition4Price = addition4Price;
    }


    public double calculatePrice() {
        System.out.println("Base price is: " + basePrice);
        double finalPrice = basePrice;

        if (addition1 != null){
            finalPrice += addition1Price;
            System.out.println("Added " + addition1 + " for an extra "+addition1Price);
        }

        if (addition2 != null){
            finalPrice += addition2Price;
            System.out.println("Added " + addition2 + " for an extra "+addition2Price);
        }

        if (addition3 != null){
            finalPrice += addition3Price;
            System.out.println("Added " + addition3 + " for an extra "+addition3Price);
        }

        if (addition4 != null){
            finalPrice += addition4Price;
            System.out.println("Added " + addition4 + " for an extra "+addition4Price);
        }

        return finalPrice;

    }




}
