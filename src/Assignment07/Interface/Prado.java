package Assignment07.Interface;

public class Prado implements CarDetails{
    @Override
    public void companyName() {
        System.out.println("Toyota");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 15Km/L");
    }

    @Override
    public void speed() {
        System.out.println("Highest Speed: 450Km/Hr");
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
