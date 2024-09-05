package Interfaces;

public class TypeOfAnimalClass implements TypeOfAnimal {
    @Override
    public String flyingAnimal() {
        return "Volador";
    }

    @Override
    public String swimminganimals() {
        return "Nadador";
    }

    @Override
    public String walkinganimals() {
        return "Caminador";
    }
}
