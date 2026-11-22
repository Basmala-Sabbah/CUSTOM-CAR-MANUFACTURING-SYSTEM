/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import observer.Observer;

/**
 *
 * @author ibda3
 */

public class FactoryOwner implements Observer {

    private String name;

    public FactoryOwner(String name) {
        this.name = name;
    }

    @Override
    public void update(String region, String size, int totalSold) {

        System.out.println("Notification for Factory Owner: " + name);

        System.out.println("Region: " + region);

        System.out.println("Chassis Size: " + size);

        System.out.println("Total Sold: " + totalSold);

        System.out.println("-------------------------");
    }
}
