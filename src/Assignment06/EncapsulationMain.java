package Assignment06;

public class EncapsulationMain {

    public static void main(String[] args){

        EncapsulationRead objRead = new EncapsulationRead("FishFeed");
        System.out.println("Food Name : "+ objRead.getFoodName());

        EncapsulationWrite objWrite = new EncapsulationWrite();
        objWrite.setQuantity(40);

        EncapsulationReadWrite objReadWrite = new EncapsulationReadWrite();
        objReadWrite.setAddress("Darusha,Rajshahi");
        System.out.println("Delivery Address : "+ objReadWrite.getAddress());





    }

}
