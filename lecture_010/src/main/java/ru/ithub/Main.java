package ru.ithub;

/*

Паттерн Composite - состовляет из объектов древовидные структуры для представления иерархии часть-целое,позволяет
клиентам единообразно трактовать индивидуальные объекты листья и составные объекты ветви.


 */

import ru.ithub.composite.Component;
import ru.ithub.composite.Composite;
import ru.ithub.composite.Leaf;


public class Main {
    public static void main(String[] args) {

        // Если дерево небольшой грубины, то используем composite. Если большая глубина и
        // большое количество элементов открываем книгу Дональда Кнута.
        Component root = new Composite("ROOT");

        Component branch1 = new Composite("BR1");
        Component branch2 = new Composite("BR2");

        Component leaf1 = new Leaf("LEAF1");
        Component leaf2 = new Leaf("LEAF2");

        root.add(branch1);
        root.add(branch2);

        branch1.add(leaf1);
        branch2.add(leaf2);

        root.operation();

    }

}