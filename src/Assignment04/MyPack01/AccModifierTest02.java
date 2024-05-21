package Assignment04.MyPack01;

public class AccModifierTest02 {

    public static void main(String[] args){

        AccModifierTest01 obj = new AccModifierTest01();
        obj.name("Nayeem"); //public method
//        obj.phone(555666777); //private method
        obj.address("Rajshahi"); //default method
        obj.email("nayeem@email.com"); //protected method

    }

}
