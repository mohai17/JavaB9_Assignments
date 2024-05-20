package Assignment07.Abstraction;

public class Hero extends VehicleDetails{
    @Override
    public void companyName() {
        System.out.println("Hero");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage : 60 KM/Hr");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel : Petrol/Octen");

    }

}
