/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import Car.Car;
import Car.MiddleEastCompactCar;
import Car.MiddleEastFullsizeCar;
import Car.MiddleEastMidsizeCar;

/**
 *
 * @author ibda3
 */

public class MiddleEastCarFactory implements CarFactory {

    @Override
    public Car createCompactCar() {
        return new MiddleEastCompactCar();
    }

    @Override
    public Car createMidsizeCar() {
        return new MiddleEastMidsizeCar();
    }

    @Override
    public Car createFullsizeCar() {
        return new MiddleEastFullsizeCar();
    }
}
