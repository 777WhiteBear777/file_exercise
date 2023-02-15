package ex_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        list.add(new Cat("Kity","Red", 4));
        list.add(new Cat("Bity","White", 2));
        list.add(new Cat("City","Blue", 3));
        list.add(new Cat("Zity","Black", 5));

        SerializeCats serializeCats = new SerializeCats();
        DeserializeCats deserializeCats = new DeserializeCats();

        serializeCats.savedFile(list);
        deserializeCats.consoleOutPut();
    }




}
