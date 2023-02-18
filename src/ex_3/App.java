package ex_3;

import java.io.FileReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/ex_2/File.txt")) {
            char[] chars = new char[300];
            int number;
            while ((number = fileReader.read(chars)) > 0) {
                if (number < chars.length) {
                    chars = Arrays.copyOf(chars, number);
                }
            }
            System.out.println(chars);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
