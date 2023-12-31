package ru.geekbrains.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {


    private Refueling refueling;
    private CarWashPlace carWashPlace;
    private WipingType wipingType;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    public void setCarWashPlace(CarWashPlace carWashPlace) {
        this.carWashPlace = carWashPlace;
    }

    public CarWashPlace getCarWashPlace() {
        return carWashPlace;
    }

    @Override
    public void wash() {
        if (carWashPlace != null) {
            carWashPlace.wash(wipingType);
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }




//    @Override
//    public void wipMirrors() {
//
//    }
//
//    @Override
//    public void wipWindshield() {
//
//    }
//
//    @Override
//    public void wipHeadlights() {
//
//    }


}
