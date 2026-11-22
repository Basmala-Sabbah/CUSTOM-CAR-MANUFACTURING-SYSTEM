/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author ibda3
 */

public class ChinaCompactCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public ChinaCompactCar() {
        name = "China Compact Car";
        description = "Compact passenger car designed for the China market";

        region = "China";
        size = "Compact";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("China Compact chassis structural layout");
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public String getSize() {
        return size;
    }
}
