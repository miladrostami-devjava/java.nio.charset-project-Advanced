package ir.readwrite;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileEncodingDemo {

    public static void main(String[] args) {

        Charset encoding = StandardCharsets.UTF_8;
        File inputFile = new File("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\java-nio-charset-project\\readandwritefiles-charset-project-1\\src\\main\\resources\\input.txt");
        File outputFile = new File("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\java-nio-charset-project\\readandwritefiles-charset-project-1\\src\\main\\resources\\output.txt");

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile),encoding));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile),encoding));
                ){
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File read and written encoding :" + " " + encoding);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
