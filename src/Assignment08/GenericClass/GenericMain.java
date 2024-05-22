package Assignment08.GenericClass;

public class GenericMain {
    public static void main(String[] args){

        Generic<Integer> generic = new Generic<>(71);
        Generic<Double> generic1 = new Generic<>(34.578);
        Generic<Long> generic2 = new Generic<>(34355878768684645L);


        System.out.println(generic.getObj());
        System.out.println(generic1.getObj());
        System.out.println(generic2.getObj());

//        GenericWildcard<Integer> genericWildcard = new GenericWildcard<>(35);
        GenericWildcard<Double> genericWildcard = new GenericWildcard<>(45.896);

        System.out.println(genericWildcard.getObj());


    }
}
