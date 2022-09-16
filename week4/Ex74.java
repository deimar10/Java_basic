package week4;



public class Ex74 {
    int multiplier;
    public Ex74(int multiplier) {
        this.multiplier = multiplier;
    }

    public static void main(String[] args){
        Ex74 threeMultiplier = new Ex74(3);
        threeMultiplier.multiply(5);
    }

    public void multiply(int otherNumber) {
        System.out.println(this.multiplier * otherNumber);
    }

}

