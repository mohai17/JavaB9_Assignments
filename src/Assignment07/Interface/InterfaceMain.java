package Assignment07.Interface;

public class InterfaceMain {
    public static void main(String[] args){

        BMW bmw = new BMW();
        bmw.companyName();
        bmw.mileage();
        bmw.fuelType();
        bmw.ac();
        bmw.enginType();

        System.out.println("\n---------------\n");

        Audi audi = new Audi();
        audi.companyName();
        audi.mileage();
        audi.fuelType();
        audi.ac();
        audi.enginType();

        System.out.println("\n---------------\n");

        Ferari ferari = new Ferari();
        ferari.companyName();
        ferari.mileage();
        ferari.fuelType();
        ferari.ac();
        ferari.enginType();


    }
}
