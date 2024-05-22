package Assignment08.GenericClass;

public class GenericWildcard<N extends Double> {

    N obj;

    public GenericWildcard(N obj) {
        this.obj = obj;
    }

    public N getObj(){
        return obj;
    }
}
