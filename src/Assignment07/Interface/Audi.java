package Assignment07.Interface;

public class Audi implements CarDetails{
    @Override
    public void companyName() {
        System.out.println("Audi");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 12 KM/Hr");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel: Petrol");
    }

    @Override
    public void ac() {
        System.out.println("Air Condition System");
    }

    @Override
    public void enginType() {
        System.out.println("ABS System.");
    }
}
