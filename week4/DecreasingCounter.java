package week4;

public class DecreasingCounter {
    int value;
    public DecreasingCounter(int value) {
        this.value = value;
    }

    public int decrease() {
        if(this.value != 0) {
            this.value--;
        }
       return this.value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }
}
