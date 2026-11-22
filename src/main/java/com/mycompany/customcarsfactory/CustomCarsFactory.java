
package com.mycompany.customcarsfactory;

import Car.Car;
import Car.ChinaMidsizeCar;
import decorators.LuxuryInterior;
import decorators.PremiumAudio;
import decorators.WindowTint;
import factories.CarFactory;
import factories.ChinaCarFactory;
import factories.MiddleEastCarFactory;
import inventory.CarInventory;
import inventory.FactoryOwner;


public class CustomCarsFactory {

    public static void main(String[] args) {
          // ==============================
        // 1. Create Car Inventory
        // ==============================

        CarInventory inventory = new CarInventory();

        // Create Factory Owner (Observer)
        FactoryOwner owner = new FactoryOwner("Thaer");

        // Register Observer
        inventory.addObserver(owner);


        // ==============================
        // 2. Test Case 1
        // China - Midsize Car
        // Luxury Interior + Window Tint
        // ==============================

        System.out.println("===== TEST CASE 1 =====");

        // Select China Factory
        CarFactory chinaFactory = new ChinaCarFactory();

        // Create Midsize Car
        Car car1 = chinaFactory.createMidsizeCar();

        // Add Decorations
        car1 = new LuxuryInterior(car1);
        car1 = new WindowTint(car1);

        // Display Car Information
        System.out.println(car1.getDescription());

        // Display Manufacturing Structure
        car1.formSize();

        // Record Sale
        inventory.recordSale(
            car1.getRegion(),
            car1.getSize()
        );
        
       

        // ==============================
        // 3. Test Case 2
        // Middle East - Fullsize Car
        // Premium Audio
        // ==============================

        System.out.println("\n===== TEST CASE 2 =====");

        // Select Middle East Factory
        CarFactory middleEastFactory = new MiddleEastCarFactory();

        // Create Fullsize Car
        Car car2 = middleEastFactory.createFullsizeCar();

        // Add Decoration
        car2 = new PremiumAudio(car2);

        // Display Car Information
        System.out.println(car2.getDescription());

        // Display Manufacturing Structure
        car2.formSize();

        // Record Sale
        inventory.recordSale(
            car2.getRegion(),
            car2.getSize()
        );
    
        
        //=======TEST3=======
        
          System.out.println("===== TEST CASE 3 =====");

        // Create Midsize Car
        Car car3 = chinaFactory.createMidsizeCar();

        // Add Decorations
        car3 = new LuxuryInterior(car3);
        car3 = new WindowTint(car3);

        // Display Car Information
        System.out.println(car3.getDescription());

        // Display Manufacturing Structure
        car3.formSize();

        // Record Sale
        inventory.recordSale(
            car3.getRegion(),
            car3.getSize()
        );
       
    }
}
