package week9.application;

public interface Sensor {
    boolean isOn(); // returns true if the sensor is on
    void on();  // switches the sensor on
    void off(); // switches the sensor off
    int measure(); // if the sensor is off, it throws an IllegalStateException
}
