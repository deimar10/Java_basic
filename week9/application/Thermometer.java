package week9.application;

public class Thermometer implements Sensor{
    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return 0;
    }
}
