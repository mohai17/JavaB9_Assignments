package Assignment04.MyPack02;

import Assignment04.MyPack01.AccModifierTest01;

public class AccModifierTest03 extends AccModifierTest01 {

    public static void main(String []args){

        AccModifierTest03 obj = new AccModifierTest03();
        obj.name("Roctim"); //public method
//        obj.phone(555666777); //private method
//        obj.address("Rajshahi"); //default method
        obj.email("roctim@email.com"); //protected method

    }

}
