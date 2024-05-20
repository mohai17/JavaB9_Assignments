package Assignment07.OverRiding;

public class OverridingMain {
    public static void main(String[] args){

        Animal animal = new Animal();
        animal.animalBehaviour();

        Tiger tiger = new Tiger();
        tiger.animalBehaviour();

        Goat goat = new Goat();
        goat.animalBehaviour();

        Bird bird = new Bird();
        bird.animalBehaviour();

    }
}
