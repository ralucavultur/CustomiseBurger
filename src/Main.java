public class Main {
    public static void main(String[] args) {
        BaseHamburger hamburger = new BaseHamburger("white", "beef");
        hamburger.calculatePrice();
        hamburger.addAddition1("tomato", 1.2);
        hamburger.addAddition2("cheese", 1.5);
        hamburger.addAddition3("salad", 0.7);
        hamburger.addAddition4("pickle", 1);
        System.out.println("Final price is: " + hamburger.calculatePrice());
        System.out.println("");

        HealthyHamburger healthyHamburger = new HealthyHamburger("chicken");
        healthyHamburger.addAddition1("tomato", 1.2);
        healthyHamburger.addAddition2("cheese", 1.5);
        healthyHamburger.addAddition3("salad", 0.7);
        healthyHamburger.addAddition4("pickle", 1);
        healthyHamburger.addAddition5("carrot", 0.9);
        healthyHamburger.addAddition6("onion", 1.1);
        System.out.println("Final price is: " + healthyHamburger.calculatePrice());

        System.out.println("");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("dark roll", "beef");
        deluxeHamburger.addAddition1("tomato", 5);
        deluxeHamburger.calculatePrice();


    }
}
