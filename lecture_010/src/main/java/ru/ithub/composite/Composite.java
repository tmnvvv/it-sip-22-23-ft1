package ru.ithub.composite;

import java.util.ArrayList;
import java.util.List;

// ветвь
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);

        for (Component component : components) {
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }
}
