/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import Car.AsiaCompactCar;
import Car.AsiaFullsizeCar;
import Car.AsiaMidsizeCar;
import Car.Car;

/**
 *
 * @author ibda3
 */

public class AsiaCarFactory implements CarFactory {

    @Override
    public Car createCompactCar() {
        return new AsiaCompactCar();
    }

    @Override
    public Car createMidsizeCar() {
        return new AsiaMidsizeCar();
    }

    @Override
    public Car createFullsizeCar() {
        return new AsiaFullsizeCar();
    }
}
