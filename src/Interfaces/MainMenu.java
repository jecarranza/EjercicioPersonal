package Interfaces;

public class MainMenu {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println("***".repeat(20) + " Pato " + "***".repeat(20));
        duck.volador();
        duck.caminador();
        duck.nadador();
        duck.conplumas();
        System.out.println();

        System.out.println("***".repeat(20) + " Tiburon " + "***".repeat(20));
        Shark shark = new Shark();
        shark.nadador();
        shark.conbranquias();
        System.out.println();

        System.out.println("***".repeat(20) + " Perro " + "***".repeat(20));
        Dog dog = new Dog();
        dog.caminador();

    }
}
