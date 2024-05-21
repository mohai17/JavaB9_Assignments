package Assignment05;

public class JumpStatement {

    public static void main(String[] args){

        for(int rollNumber=0 ; rollNumber<=10 ; rollNumber++){
            if(rollNumber==4){
                break;
            }
            else {
                System.out.println(rollNumber);
            }

        }

        System.out.println("-------------------------------------");

        for(int id=300; id<310; id++){
            if (id>=303 && id<=307){
                continue;
            }
            else {
                System.out.println(id);
            }
        }
    }

}
