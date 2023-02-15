package ex_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeCats {

    public void consoleOutPut(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/ex_4/File.txt"))){
            List<Cat> list = (List<Cat>) objectInputStream.readObject();
            System.out.println(list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
