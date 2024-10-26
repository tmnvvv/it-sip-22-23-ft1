package classes;

public class Adapter extends Adaptee implements ITarget {

    @Override
    public void request() {
        specificRequest();
    }
}
