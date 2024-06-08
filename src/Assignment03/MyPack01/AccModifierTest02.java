package Assignment03.MyPack01;

public class AccModifierTest02 {

    public static void main(String[] args){

        AccModifierTest01 obj = new AccModifierTest01();

        String name = obj.name; //public
//        int phone = obj.phone; //private
        String address = obj.address; //default
        String email = obj.email; //protected

        System.out.println("\n---------From Different Class---------");
        System.out.println(name);
//        System.out.println(this.phone);
        System.out.println(address);
        System.out.println(email);

    }

}
