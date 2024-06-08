package Assignment06;

public class MultilevelChild extends MultilevelParent{

    public void transportCost(double busTravelingCost, double triCycleTravelingCost){
        this.TotalCost = busTravelingCost + triCycleTravelingCost;
        System.out.println("Total TransportCost = "+this.TotalCost+"$");
    }

}
