package Assignment04;

public class Conditions {

    public static void main(String[] args){

        Conditions obj = new Conditions();

        obj.if_else_nested_ladder(55);
        obj.switch_case(2);
    }

    public void if_else_nested_ladder(int x){

        if(x <= 100 && x >= 70){

            if(x >= 85){
                System.out.println("Full Red Flag");
            }
            else{
                System.out.println("Half Red Flag");
            }

        }
        else if (x < 70 && x >= 40) {

            if( x >= 60){
                System.out.println("Full Yellow Flag");
            }
            else{
                System.out.println("Half Yellow Flag");
            }
        }
        else{
            System.out.println("Green Flag");
        }
    }

    public void switch_case(int x){
        switch (x){
            case 1:{
                System.out.println("One");
                break;
            }
            case 2:{
                System.out.println("Two");
                break;
            }
            case 3:{
                System.out.println("Three");
                break;
            }
            default:{
                System.out.println("Out of the box...");
            }
        }

    }
}
