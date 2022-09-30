package week5;


public class Ex84 {
    Integer startingValue;
    Boolean check;
    public  Ex84(int startingValue, boolean check){
    this.startingValue = startingValue;
    this.check = check;
    }

    public Ex84(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }

    public  Ex84(boolean check){
        this.startingValue = 0;
        this.check = check;
    }

    public Ex84(){
        this.startingValue = 0;
        this.check = false;
    }

    public int value(){
        return this.startingValue;
    }

    public void increase(){
        if (check){
           this.startingValue++;
            System.out.println(startingValue);
        }
    }

    public void decrease(){
        if (!check){
            this.startingValue--;

        }
        if (check && startingValue != 0) {
            this.startingValue--;

        }
    }

    public static void main(String[] args) {
        Ex84 returns = new Ex84(0, true);
        returns.value();
        Ex84 increases  = new Ex84(0, true);
        increases.increase();
        Ex84 decreases  = new Ex84(1, true);
        decreases.decrease();
        decreases.decrease();
        decreases.decrease();
        decreases.decrease();

    }
}
