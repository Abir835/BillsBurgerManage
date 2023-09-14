package BillsBurgersManage;

public class Main {
    public static void main(String[] args) {

        System.out.println("__________START___________\n");

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamBurger());

        System.out.println("___________END__________\n");
        System.out.println("__________START___________\n");


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamBurger());

        System.out.println("___________END__________\n");
        System.out.println("__________START___________\n");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " +
        healthyBurger.itemizeHamBurger());

        System.out.println("___________END__________\n");

    }
}
