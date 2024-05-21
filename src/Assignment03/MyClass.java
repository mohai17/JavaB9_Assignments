package Assignment03;

public class MyClass {

    //Instance variable
    int age = 25;

    //Constructor
    MyClass(){
        System.out.println("\nConstructor is running...");
    }

    //Instance method
    public void display(){

        int age = this.age;

        System.out.println("Age: "+age);

    }

    public static void main(String []args){

        MyClass obj = new MyClass();
        obj.display();

    }

}
