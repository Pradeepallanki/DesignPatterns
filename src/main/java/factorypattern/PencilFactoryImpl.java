package main.java.factorypattern;

public final class PencilFactoryImpl {

    private PencilFactoryImpl() {}

    public static IPencil getPensil(final String pensilType) throws ClassNotFoundException {

        switch(pensilType) {
            case PencilConstants.RED_PENSIL:
                return new RedPencil();
            case PencilConstants.BLUE_PENSIL:
                return new BluePencil();
            default:
                throw new ClassNotFoundException();
        }
    }
}
