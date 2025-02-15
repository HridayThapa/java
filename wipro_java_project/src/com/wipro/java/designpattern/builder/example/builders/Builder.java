package com.wipro.java.designpattern.builder.example.builders;

import com.wipro.java.designpattern.builder.example.cars.CarType;
import com.wipro.java.designpattern.builder.example.components.Engine;
import com.wipro.java.designpattern.builder.example.components.GPSNavigator;
import com.wipro.java.designpattern.builder.example.components.Transmission;
import com.wipro.java.designpattern.builder.example.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}