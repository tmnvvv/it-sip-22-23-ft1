package ru.ithub.composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
