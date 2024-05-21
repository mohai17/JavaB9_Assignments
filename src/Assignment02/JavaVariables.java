package Assignment02;

public class JavaVariables {

    static int age = 20;
    double cost = 300;

    public static void main(String[] args){

        JavaVariables obj = new JavaVariables();
        obj.myMethod();
    }

    public void myMethod(){
        int x = 50;
        System.out.println("x = "+x);
        System.out.println("cost = "+this.cost);
        System.out.println("age = "+JavaVariables.age);
    }
}
