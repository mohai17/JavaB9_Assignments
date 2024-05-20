package Assignment06;

public class SingleInheritanceChild extends SingleInheritanceParent{

    public void triangleArea(double base, double height){

        this.area = .5*base*height;
        System.out.println("Area of the Triangle is "+this.area);

    }

}
