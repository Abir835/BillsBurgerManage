package BillsBurgersManage;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

//    List<Map<String, Object>> dataList = new ArrayList<>();
//
//    Map<String, Object> data = new HashMap<>();
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
//        data.put("name", name);
//        data.put( "price", price);
//        dataList.add(data);
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamBurger() {

        double totalPrice = this.price;
//        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
//        for (Map<String, Object> data : dataList) {
//            System.out.println(data.get("name"));
//            System.out.println("Added " + data.get("name") + " for an extra " + data.get("price"));
//            double price = (double) data.get("price");
//            totalPrice += price;
//        }
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.addition1Name != null) {
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
            totalPrice += this.addition1Price;
        }

        if (this.addition2Name != null) {
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
            totalPrice += this.addition2Price;
        }

        if (this.addition3Name != null) {
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
            totalPrice += this.addition3Price;
        }

        if (this.addition4Name != null) {
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
            totalPrice += this.addition4Price;
        }

        return totalPrice;
    }
}



