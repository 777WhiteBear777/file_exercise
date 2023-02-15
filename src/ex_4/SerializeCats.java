package ex_4;

import java.io.*;
import java.util.List;

public class SerializeCats implements Serializable {

    public void savedFile(List<Cat> list){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/ex_4/File.txt"))){
            objectOutputStream.writeObject(list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
