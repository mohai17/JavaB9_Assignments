package Assignment07.Overloading;

public class Calculations {
    public void cal(){
        System.out.println("None");
    }
    public void cal(int a){
        System.out.println("A = "+a);
    }
    public void cal(int a, int b){
        System.out.println("A+B = "+(a+b));
    }
    public void cal(int a, int b, int c){
        System.out.println("A*B*C = "+(a*b*c));
    }
}
