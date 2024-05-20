package Assignment07.Overloading;

public class OverloadingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        calculator.calculation();
        calculator.calculation(5);
        calculator.calculation(6,7);
        calculator.calculation(3,4,5);

    }
}
