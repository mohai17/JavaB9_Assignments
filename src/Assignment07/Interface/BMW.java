package Assignment07.Interface;

public class BMW implements CarDetails{
    @Override
    public void companyName() {
        System.out.println("BMW");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 7Km/L");
    }

    @Override
    public void speed() {
        System.out.println("Highest Speed: 250Km/Hr");
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
