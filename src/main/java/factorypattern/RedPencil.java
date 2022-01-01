package main.java.factorypattern;

public class RedPencil implements IPencil {
    @Override
    public void draw() {
        System.out.println("Drawing from Red pensil");
    }
}
