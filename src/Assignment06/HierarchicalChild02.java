package Assignment06;

public class HierarchicalChild02 extends HierarchicalParent{

    public void sphereArea(double radius){
        this.area = 4 * this.PI * radius * radius;
        System.out.println("Area of the Sphere is "+this.area);
    }

}
