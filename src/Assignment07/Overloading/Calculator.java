package Assignment07.Overloading;

public class Calculator {
    public void calculation(){
        System.out.println("No Results.");
    }
    public void calculation(int a){
        System.out.println("A = "+a);
    }
    public void calculation(int a, int b){
        System.out.println("A+B = "+(a+b));
    }
    public void calculation(int a, int b, int c){
        System.out.println("A*B*C = "+(a*b*c));
    }
}
