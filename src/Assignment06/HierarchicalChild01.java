package Assignment06;

public class HierarchicalChild01 extends HierarchicalParent{

    public void circularArea(double radius){
        this.area = this.PI * radius * radius;
        System.out.println("The Area of the Circle is "+this.area);
    }
}
