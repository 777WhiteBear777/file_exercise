package ex_2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter name list: ");
            String line = bufferedReader.readLine();

            try (FileOutputStream fileOutputStream = new FileOutputStream("src/ex_2/File.txt")) {
                byte[] bytes = line.getBytes();
                int number = 2;
                byte[] tab = " ".getBytes();
                fileOutputStream.write("1. ".getBytes());
                for (int i = 0; i < bytes.length - 1; i++) {
                    if (bytes[i] == tab[0]) {
                        fileOutputStream.write(("\n" + number + ". ").getBytes());
                        number++;
                        i++;
                    }
                    fileOutputStream.write(bytes[i]);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
