/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author ibda3
 */

public class MiddleEastMidsizeCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public MiddleEastMidsizeCar() {
        name = "Middle East Midsize Car";
        description = "Midsize passenger car designed for the Middle East market";

        region = "Middle East";
        size = "Midsize";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("Middle East Midsize chassis structural layout");
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
