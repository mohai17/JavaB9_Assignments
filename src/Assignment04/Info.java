package Assignment04;

public class Info {
    public static void main(String[] args){

        Info obj = new Info();

        obj.display();

        System.out.println(obj.age_valid());

        obj.deposit(33.45,67.89);

        System.out.println(obj.sum(44,99));

    }

    // no parameter no return value
    public void display(){
        System.out.println("Md. Mohai Minul Islam");
    }

    //no parameter with return value
    public String age_valid(){

        int age = 25;

        if(age>=18){
            return "Adult";
        }
        else{
            return "Child";
        }
    }

    //with parameter no return value
    public void deposit(double x, double y){
        double deposit = x + y;
        System.out.println(deposit);
    }


    //with parameter with return value
    public int sum(int a, int b){
        return a + b;
    }





}
