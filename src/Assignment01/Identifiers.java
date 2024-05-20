package Assignment01;

//package Student;
//package student;
//package Roll_Number;
//package _section;
//package $section;
//package cost_$;
//package bill_201;
//package student21;


public class Identifiers {
    public static void main(String[] args){
        int Number = 10;
        int number = 20;
        int Roll_Number = 221;
        char _section = 'A';
        char $section = 'B';
        double cost_$ = 44.60;
        double bill_201 = 303.23;
        double student21 = 71;

        System.out.println(Number);
        System.out.println(number);
        System.out.println(Roll_Number);
        System.out.println(_section);
        System.out.println($section);
        System.out.println(cost_$);
        System.out.println(bill_201);
        System.out.println(student21);

        Identifiers obj = new Identifiers();
        obj.customer();
        obj.Customer_Details();
        obj._orders();
        obj.$cart();
        obj.bill_71();
    }
    public void customer(){
        System.out.println("Customer Method");
    }
    public void Customer_Details(){
        System.out.println("Customer_Details Method");
    }
    public void _orders(){
        System.out.println("_orders Method");
    }
    public void $cart(){
        System.out.println("$cart Method");
    }
    public void bill_71(){
        System.out.println("bill_71 Method");
    }
}

class Student{

}

class Student_01{

}
class Batch09{

}
class $_Manager{

}
class customer{

}

class Orders_{

}
class Cost${

}
class Customer_Details{

}