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
public abstract class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

    @Override
    public void formSize() {
        car.formSize();
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
