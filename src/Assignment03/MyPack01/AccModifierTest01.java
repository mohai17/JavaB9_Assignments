package Assignment03.MyPack01;

public class AccModifierTest01 {

    public String name = "Mohai Minul";
    private int phone = 123456789;
    String address = "Rajshahi";
    protected String email = "example@email.com";

    public static void main(String[] args){
        AccModifierTest01 obj = new AccModifierTest01();
        obj.display();
    }

    public void display(){

        System.out.println("\n---------From Same Class---------");
        System.out.println(this.name);
        System.out.println(this.phone);
        System.out.println(this.address);
        System.out.println(this.email);

    }
}
