package Assignment07.Overriding;

public class OverridingMain {
    public static void main(String[] args){

        Animal animal = new Animal();
        animal.animalBehaviour();

        Tiger tiger = new Tiger();
        tiger.animalBehaviour();

        Bird bird = new Bird();
        bird.animalBehaviour();

    }
}
