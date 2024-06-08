package Assignment07.Overloading;

public class OverloadingMain {
    public static void main(String[] args){

        Calculations calculations = new Calculations();
        calculations.cal();
        calculations.cal(5);
        calculations.cal(6,7);
        calculations.cal(3,5,8);
    }
}
