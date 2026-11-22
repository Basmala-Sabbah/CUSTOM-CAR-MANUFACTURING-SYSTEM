/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author ibda3
 */
import java.util.ArrayList;
import java.util.List;
import observer.Observer;
import observer.Subject;

public class CarInventory implements Subject {

    private List<Observer> observers;

    private int chinaCompact = 0;
    private int chinaMidsize = 0;
    private int chinaFullsize = 0;

    private int middleEastCompact = 0;
    private int middleEastMidsize = 0;
    private int middleEastFullsize = 0;

    private int asiaCompact = 0;
    private int asiaMidsize = 0;
    private int asiaFullsize = 0;

    public CarInventory() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String region, String size, int totalSold) {
        for (Observer observer : observers) {
            observer.update(region, size, totalSold);
        }
    }

    public void recordSale(String region, String size) {

        int totalSold = 0;

        if (region.equals("China")) {

            if (size.equals("Compact")) {
                totalSold = ++chinaCompact;
            } else if (size.equals("Midsize")) {
                totalSold = ++chinaMidsize;
            } else if (size.equals("Fullsize")) {
                totalSold = ++chinaFullsize;
            }

        } else if (region.equals("Middle East")) {

            if (size.equals("Compact")) {
                totalSold = ++middleEastCompact;
            } else if (size.equals("Midsize")) {
                totalSold = ++middleEastMidsize;
            } else if (size.equals("Fullsize")) {
                totalSold = ++middleEastFullsize;
            }

        } else if (region.equals("Asia")) {

            if (size.equals("Compact")) {
                totalSold = ++asiaCompact;
            } else if (size.equals("Midsize")) {
                totalSold = ++asiaMidsize;
            } else if (size.equals("Fullsize")) {
                totalSold = ++asiaFullsize;
            }
        }

        if (totalSold > 0) {
            notifyObservers(region, size, totalSold);
        }
    }
}