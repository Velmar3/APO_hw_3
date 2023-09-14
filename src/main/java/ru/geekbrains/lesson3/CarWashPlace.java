package ru.geekbrains.lesson3;

public class CarWashPlace implements CarWash {
    @Override
    public void wash(WipingType wipingType) {
        switch (wipingType){
            case Mirrors -> System.out.println("Чистка зеркал");
            case Windshield -> System.out.println("Чистка лобового стекла");
            case Headlights -> System.out.println("Чистка фар");
        }
    }
}
