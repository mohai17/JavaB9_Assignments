package Assignment03.MyPack02;

import Assignment03.MyPack01.AccModifierTest01;

public class AccModifierTest03 extends AccModifierTest01{

    public static void main(String []args){

        AccModifierTest01 obj = new AccModifierTest01();

        String name = obj.name; //public
//        int phone = obj.phone; //private
//        String address = obj.address; //default

        AccModifierTest03 obj2 = new AccModifierTest03();

        String email = obj2.email; // protected


        System.out.println(name);
//        System.out.println(phone);
//        System.out.println(address);
        System.out.println(email);

    }

}
