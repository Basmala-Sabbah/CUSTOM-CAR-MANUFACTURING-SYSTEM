/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Car;

/**
 *
 * @author ibda3
 */

public class AsiaMidsizeCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public AsiaMidsizeCar() {
        name = "Asia Midsize Car";
        description = "Midsize passenger car designed for the Asia market";

        region = "Asia";
        size = "Midsize";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("Asia Midsize chassis structural layout");
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
