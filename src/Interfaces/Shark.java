package Interfaces;

public class Shark implements nadador, conbranquias {
    @Override
    public void conbranquias() {
        System.out.println("con branquias");
    }

    @Override
    public void nadador() {
        System.out.println("nadador");
    }
}
