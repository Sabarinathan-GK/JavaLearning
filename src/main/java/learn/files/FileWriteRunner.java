package learn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        Path pathToFileWrite = Paths.get("./src/main/resources/writesdata.txt");
        List writeData = List.of("101","Sabari","102","Shalini","103","Apple");
        Files.write(pathToFileWrite, writeData);
        Files.readAllLines(pathToFileWrite).forEach(System.out::println);
    }
}
