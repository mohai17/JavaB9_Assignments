package Assignment07.Interface;

public class Audi implements CarDetails{
    @Override
    public void companyName() {
        System.out.println("Audi");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 5Km/L");
    }

    @Override
    public void speed() {
        System.out.println("Highest Speed: 350Km/Hr");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel: Diesel");
    }

    @Override
    public void breakingSystem() {
        System.out.println("Breaking System: Anti-Lock");
    }
}
