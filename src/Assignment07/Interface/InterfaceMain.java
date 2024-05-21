package Assignment07.Interface;

public class InterfaceMain {
    public static void main(String[] args){

        BMW bmw = new BMW();
        bmw.companyName();
        bmw.mileage();
        bmw.speed();
        bmw.fuel();
        bmw.breakingSystem();

        System.out.println("\n--------------------\n");

        Audi audi = new Audi();
        audi.companyName();
        audi.mileage();
        audi.speed();
        audi.fuel();
        audi.breakingSystem();

        System.out.println("\n--------------------\n");

        Prado prado = new Prado();
        prado.companyName();
        prado.mileage();
        prado.speed();
        prado.fuel();
        prado.breakingSystem();
    }
}
