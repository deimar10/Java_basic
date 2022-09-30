package week10;

public class DeluxeBurger extends Hamburger implements Itemize{

    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54, "White roll");
        System.out.println(name + " hamburger on a " + beadRollType + " with " + meat + " ,price is " + price);
    }


    public void addHamburgerAddition1() {
            System.out.println("Cannot not add additional items to a deluxe burger");
    }

    public void addHamburgerAddition2() {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }


    public void addHamburgerAddition3() {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }


    public void addHamburgerAddition4(){

        System.out.println("Cannot not add additional items to a deluxe burger");
    }
    @Override
    public double itemizeHamburger() {
        double Chips = 2.75;
        double Drink = 1.81;
        double Total = Chips + Drink + price;
        return Total;
    }

}
