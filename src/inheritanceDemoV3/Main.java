package inheritanceDemoV3;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println(animal.getNumberOfLegs());
        Mammal mammal = new Mammal();
        System.out.println(mammal.getNumberOfLegs());

        mammal.setBeingDangerous(true);
        mammal.setNumberOfLegs(2);
        mammal.setDiet("Herbivore");
        System.out.println(mammal);

        Reptile reptile = new Reptile();
        System.out.println(reptile);


    }
}
