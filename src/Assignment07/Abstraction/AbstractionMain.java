package Assignment07.Abstraction;

public class AbstractionMain {
    public static void main(String[] args){


        CT100 ct100 = new CT100();
        ct100.companyName();
        ct100.enginType();
        ct100.fuel();

        System.out.println("\n-------------------\n");

        RoyalEnfield royalEnfield = new RoyalEnfield();
        royalEnfield.companyName();
        royalEnfield.enginType();
        royalEnfield.fuel();

        System.out.println("\n-------------------\n");

        R15 r15 = new R15();
        r15.companyName();
        r15.enginType();
        r15.fuel();

    }
}
