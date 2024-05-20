package Assignment07.Interface;

public class Ferari implements CarDetails{
    @Override
    public void companyName() {
        System.out.println("Ferari");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 4 KM/Hr");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel: Diesel");
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
