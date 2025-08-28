package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall north = new Wall("North");
        Wall south = new Wall("South");
        Wall east  = new Wall("East");
        Wall west  = new Wall("West");

        Ceiling ceiling = new Ceiling(270, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 60, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(200, 220, 120.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.GREEN);

        Bedroom bedroom = new Bedroom(
                "My Bedroom",
                north, south, east, west,
                ceiling, bed, lamp, wardrobe, carpet
        );

        bedroom.getCeiling().create();
        bedroom.getWall1().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
    }
}
