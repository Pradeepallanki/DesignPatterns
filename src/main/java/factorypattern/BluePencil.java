package main.java.factorypattern;

public class BluePencil implements IPencil {
    @Override
    public void draw() {
        System.out.println("Drawing from BluePensil");
    }
}
