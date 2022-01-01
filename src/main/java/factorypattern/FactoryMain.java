package main.java.factorypattern;

public class FactoryMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // If you want to use red pensil
        IPencil myPencil = PencilFactoryImpl.getPensil(PencilConstants.RED_PENSIL);
        myPencil.draw();

        // If you want to use blue pensil
        IPencil anotherPensil = PencilFactoryImpl.getPensil(PencilConstants.BLUE_PENSIL);
        anotherPensil.draw();

    }
}
