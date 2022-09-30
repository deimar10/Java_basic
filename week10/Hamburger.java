package week10;

import javax.naming.Name;
import java.util.ArrayList;

public class Hamburger implements Itemize{

    ArrayList<String>arrList;
    ArrayList<Double>arrList2;
    String name;
    String meat;
    Double price;
    String beadRollType;

    String addition1Name;

    Double addition1Price;

    String addition2Name;

    Double addition2Price;

    String addition3Name;

    Double addition3Price;

    String addition4Name;

    Double addition4Price;

    public Hamburger(String name, String meat, Double price, String beadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.beadRollType = beadRollType;
        this.arrList = new ArrayList<String>();
        this.arrList2 = new ArrayList<Double>();
        System.out.println("Basic " + "hamburger on a " + beadRollType + " Roll with " +  meat + ", price is " + price);
    }
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        arrList.add(addition1Name);
        arrList2.add(addition1Price);
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, Double addition2Price){
        arrList.add(addition2Name);
        arrList2.add(addition2Price);
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, Double addition3Price){
        arrList.add(addition3Name);
        arrList2.add(addition3Price);
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }
    public void addHamburgerAddition4(){

    }
    @Override
    public double itemizeHamburger() {
        Double Total = this.price;
        for (Double additionPrice : arrList2) {
            Total +=  additionPrice;
        }
        return Total;
    }}
