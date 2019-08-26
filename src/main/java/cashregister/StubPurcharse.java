package cashregister;

public class StubPurcharse extends Purchase {
    public StubPurcharse(){
        super(new Item[0]);
    }

    @Override
    public String asString(){
        return "test product\t1.0\n";
    }

}
