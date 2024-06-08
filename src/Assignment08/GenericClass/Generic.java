package Assignment08.GenericClass;

public class Generic<N> {
    N obj;

    public Generic(N obj){
        this.obj = obj;
    }

    public N getObj(){
        return obj;
    }
}
