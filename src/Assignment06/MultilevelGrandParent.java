package Assignment06;

public class MultilevelGrandParent {

    public double TotalCost;

    public void logisticCost(double bannerCost, double digitalMarketingCost){

        this.TotalCost = bannerCost + digitalMarketingCost;
        System.out.println("Total Logistic Cost = "+this.TotalCost+"$");

    }

}
