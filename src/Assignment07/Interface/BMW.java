package Assignment07.Interface;

public class BMW implements CarDetails{
    @Override
    public void companyName() {
        System.out.println("BMW");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 7 KM/Hr");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel: Octen");
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
