package Assignment06;

public class MultilevelParent extends MultilevelGrandParent{

    public void cateringServiceCost(double lunchCost, double snacksCost){

        this.TotalCost = lunchCost + snacksCost;
        System.out.println("Total Catering Service Cost = "+this.TotalCost+"$");
    }

}
