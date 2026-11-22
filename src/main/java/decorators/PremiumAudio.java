/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorators;

import Car.Car;

/**
 *
 * @author ibda3
 */
public class PremiumAudio extends CarDecorator {

    public PremiumAudio(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + Premium Audio System";
    }
    @Override
    public String getRegion() {
        return car.getRegion();
    }

    @Override
    public String getSize() {
        return car.getSize();
    }
}