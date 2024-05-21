package Assignment02;

public class JavaOperators {

    public static void main(String[] args){

        JavaOperators obj = new JavaOperators();

        obj.Arithmetic_Operator();
        obj.Relational_Operator();
        obj.Logical_Operator();
        obj.Assignment_Operator();
        obj.Unary_Operator();
        obj.Ternary_Operator();


    }
    public void Arithmetic_Operator(){

        System.out.println("\n----------Arithmetic Operator--------------");

        int a = 103;
        int b = 20;

        System.out.println(a+b); //123
        System.out.println(a-b); //83
        System.out.println(a*b); //2060
        System.out.println((double)a/b); //5.15
        System.out.println(a%b); //3


    }
    public void Relational_Operator(){

        System.out.println("----------Relational Operator--------------");

        int a = 12, b = 19;

        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true

    }
    public void Logical_Operator(){

        System.out.println("----------Logical Operator--------------");

        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    }
    public void Assignment_Operator(){

        System.out.println("----------Assignment Operator--------------");

        int count = 11;

        count += 2;
        System.out.println(count); //13
        count -=3;
        System.out.println(count); //10
        count *=2;
        System.out.println(count); //20
        count /=3;
        System.out.println(count); //6
        count %=4;
        System.out.println(count); //2


    }
    public void Unary_Operator(){

        System.out.println("----------Unary Operator--------------");
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10

    }
    public void Ternary_Operator(){

        System.out.println("----------Ternary Operator--------------");

        int februaryDays = 29;
        String result;

        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result+"\n\n");


    }

}
