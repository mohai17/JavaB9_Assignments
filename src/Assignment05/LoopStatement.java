package Assignment05;

public class LoopStatement {
    public static void main(String[] args){

        //for loop

        for(int tokenNumber = 1001; tokenNumber <= 1005; tokenNumber++){
            System.out.println(tokenNumber);
        }
        for(int tokenNumber = 2030; tokenNumber > 2025; tokenNumber--){
            System.out.println(tokenNumber);
        }

        int rollNumber = 200;
        for(;rollNumber < 206;){
            System.out.println(rollNumber);
            rollNumber++;
        }

        //while loop

        int articleNo = 1;

        while(articleNo < 5){
            System.out.println("Article-"+articleNo);

            articleNo++;
        }

        int actNo = 10;

        while(actNo > 5){
            System.out.println("Act: "+actNo);

            actNo--;
        }

        //do-while loop

        int pageNumber = 30;

        do{
            System.out.println("Page Number:"+pageNumber);
            pageNumber++;
        }while (pageNumber < 35);

        int columnNumber = 40;

        do{
            System.out.println("Column Number:"+columnNumber);
            columnNumber--;
        }while (columnNumber > 35);


        //for-each loop

        String[] studentsName = {"Rohim","Korim","Kabir","Jhon","Moni"};

        for(String name:studentsName){
            System.out.println(name);
        }

        String[] fruitsName = {"Apple","Banana","Water-melon","Mango","Grape","Date"};

        for(String name:fruitsName){
            System.out.println(name);
        }

        String[] districtName = {"Rajshahi","Natore","Dhaka","Rongpur"};

        for (String name:districtName){
            System.out.println(name);
        }



    }
}
