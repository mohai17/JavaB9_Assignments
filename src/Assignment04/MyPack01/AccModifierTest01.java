package Assignment04.MyPack01;

public class AccModifierTest01 {


    public static void main(String[] args){
        AccModifierTest01 obj = new AccModifierTest01();
        obj.name("Mohai Minul");
        obj.phone(123456789);
        obj.address("Rajshahi");
        obj.email("example@email.com");
    }

    public void name(String name){
        System.out.println(name);
    }

    private void phone(int phone){
        System.out.println(phone);
    }

    void address(String address){
        System.out.println(address);
    }

    protected void email(String email){
        System.out.println(email);
    }

}
