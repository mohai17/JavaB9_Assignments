package Assignment07.Abstraction;

public class RoyalEnfield extends VehicleDetails{
    @Override
    public void companyName() {
        System.out.println("Royal Enfield");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage : 25 KM/Hr");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel : Diesel");
    }
}
