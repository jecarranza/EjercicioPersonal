package Interfaces;

public class MainMenu {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println("Un pato se comporta como un " + duck.flyingAnimal() + " , como un " + duck.swimminganimals() + " y como un " + duck.walkinganimals());
        System.out.println("***".repeat(50));

        Dolphin dolphin = new Dolphin();
        System.out.println("Un delfin se comporta como un " + dolphin.swimminganimals());
        System.out.println("***".repeat(50));

        Dog dog = new Dog();
        System.out.println("Un perro se comporta como un " + dog.walkinganimals());
    }
}
