package ex_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("1. Apple \n2. Loki \n3. Tree");
            String line = bufferedReader.readLine();
            for (int i = 0; i < 4; i++) {
                FileInputStream fileInputStream = new FileInputStream("src/ex_1/folder1/folder2/folder3/File" + i + ".txt");
                byte[] bytes = fileInputStream.readAllBytes();
                StringBuilder text = new StringBuilder();
                for (int j = 0; j < bytes.length; j++) {
                    text.append((char) bytes[j]);
                }
                if (line.equalsIgnoreCase(text.toString())) {
                    System.out.println("File" + i + ".txt");
                }
                fileInputStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
