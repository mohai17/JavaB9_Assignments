package Assignment07.Abstraction;

public class AbstractionMain {
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.companyName();
        hero.mileage();
        hero.fuel();
        hero.abs();

        System.out.println("\n--------------------\n");

        Yamaha yamaha = new Yamaha();
        yamaha.companyName();
        yamaha.mileage();
        yamaha.fuel();
        yamaha.abs();

        System.out.println("\n--------------------\n");

        RoyalEnfield royalEnfield = new RoyalEnfield();
        royalEnfield.companyName();
        royalEnfield.mileage();
        royalEnfield.fuel();
        royalEnfield.abs();
    }
}
