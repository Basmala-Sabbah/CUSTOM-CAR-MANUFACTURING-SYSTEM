/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import Car.Car;
import Car.ChinaCompactCar;
import Car.ChinaFullsizeCar;
import Car.ChinaMidsizeCar;

/**
 *
 * @author ibda3
 */
public class ChinaCarFactory implements CarFactory {

    @Override
    public Car createCompactCar() {
        return new ChinaCompactCar();
    }

    @Override
    public Car createMidsizeCar() {
        return new ChinaMidsizeCar();
    }

    @Override
    public Car createFullsizeCar() {
        return new ChinaFullsizeCar();
    }
}