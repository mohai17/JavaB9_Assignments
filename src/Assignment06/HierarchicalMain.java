package Assignment06;

public class HierarchicalMain {
    public static void main(String[] args){
        HierarchicalChild01 obj1 = new HierarchicalChild01();
        obj1.customConstant("Child_01");
        obj1.circularArea(4);

        System.out.println("\n-------------------------------------\n");

        HierarchicalChild02 obj2 = new HierarchicalChild02();
        obj2.customConstant("Child_02");
        obj2.sphereArea(7);
    }
}
