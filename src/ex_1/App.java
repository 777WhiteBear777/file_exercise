package ex_1;

import java.io.*;
import java.util.Objects;

public class App {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("1. Apple \n2. Loki \n3. Tree");
            String line = bufferedReader.readLine();
            File file = new File("src/ex_1/folder1/folder2/folder3.");
            File[] files = file.listFiles();
            for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
                FileInputStream fileInputStream = new FileInputStream("src/ex_1/folder1/folder2/folder3/File" + i + ".txt");
                byte[] bytes = fileInputStream.readAllBytes();
                StringBuilder text = new StringBuilder();
                for (byte aByte : bytes) {
                    text.append((char) aByte);
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
