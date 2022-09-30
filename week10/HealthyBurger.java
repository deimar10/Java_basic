package week10;

import java.util.ArrayList;

public class HealthyBurger implements Itemize{
    ArrayList<String>arrayList;
    ArrayList<Double>arrayList2;
    String name;
    String meat;
    Double price;
    String breadRoll;
    String healthyExtra1Name;
    Double healthyExtra1Price;
    String healthyExtra2Name;
    Double healthyExtra2Price;

    public HealthyBurger(String name, String meat, Double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
        this.arrayList = new ArrayList<String>();
        this.arrayList2 = new ArrayList<Double>();
        System.out.println(name + "hamburger on a " + breadRoll + " rye roll with " + meat + ", price is " + price);
    }
    public void addHealthyAddition1(String healthyExtra1Name, Double healthyExtra1Price){
        arrayList.add(healthyExtra1Name);
        arrayList2.add(healthyExtra1Price);
        System.out.println("Added " + healthyExtra1Name + " for and extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, Double healthyExtra2Price){
        arrayList.add(healthyExtra2Name);
        arrayList2.add(healthyExtra2Price);
        System.out.println("Added " + healthyExtra2Name + " for and extra " + healthyExtra2Price);
    }


    @Override
    public double itemizeHamburger() {
      double Total =  price;
        for (Double healthyExtraPrice: arrayList2) {
            Total += healthyExtraPrice;
        }
       return Total;
    }
}
