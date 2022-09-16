package week4;


public class Ex73 {
    private double cost;
    private String product;
    private int amount;
    public Ex73(String product, double cost, int amount) {
        this.product = product;
        this.cost = cost;
        this.amount = amount;
    }
    public static void main(String[] args){
        Ex73 fruits = new Ex73("Banana",1.1,13);
        fruits.printProduct();
    }
    public void printProduct(){
        System.out.println(this.product + " " + this.cost + " " + this.amount);
    }
}
