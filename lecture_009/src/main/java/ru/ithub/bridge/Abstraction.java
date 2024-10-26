package ru.ithub.bridge;

public abstract class Abstraction {

    private Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operation() {
        this.implementation.operationImplementation();
    }
}
