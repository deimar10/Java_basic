package week9.application;

public class ConstantSensor implements Sensor {
    Integer number;

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.number;
    }
    public ConstantSensor(Integer number){
        this.number = number;
    }
}
