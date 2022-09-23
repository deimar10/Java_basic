package week8;

public class MilitaryService implements NationalService{
int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0){
            this.daysLeft--;
        }
    }
}
