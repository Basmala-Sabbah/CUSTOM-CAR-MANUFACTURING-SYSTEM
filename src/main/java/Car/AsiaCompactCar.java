/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author ibda3
 */

public class AsiaCompactCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public AsiaCompactCar() {
        name = "Asia Compact Car";
        description = "Compact passenger car designed for the Asia market";

        region = "Asia";
        size = "Compact";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("Asia Compact chassis structural layout");
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
