package Interfaces;

public class Duck implements volador, nadador, caminador, plumas {

    @Override
    public void caminador() {
        System.out.println("caminador");
    }

    @Override
    public void nadador() {
        System.out.println("nadador");
    }

    @Override
    public void conplumas() {
        System.out.println("con plumas");
    }

    @Override
    public void volador() {
        System.out.println("volador");
    }
}
