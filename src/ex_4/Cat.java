package ex_4;

import java.io.Serializable;

public class Cat implements Serializable {
    private final String name;
    private final String breed;
    private final int weight;

    public Cat(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
