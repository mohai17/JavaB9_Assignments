package Assignment07.Abstraction;

public class Yamaha extends VehicleDetails{
    @Override
    public void companyName() {
        System.out.println("Yamaha");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage : 45 KM/Hr");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel : Petrol/Octen");
    }
}
