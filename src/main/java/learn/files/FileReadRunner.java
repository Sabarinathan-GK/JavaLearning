package learn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {
        Path pathToFileRead = Paths.get("./src/main/resources/data.txt");
        // this way reading a file at a time. so it will cause reading large size of file
        List<String> lines = Files.readAllLines(pathToFileRead);
        System.out.println(lines);
        //this way read each line of file at a time
        Files.lines(pathToFileRead).forEach(System.out::println);
        Files.lines(pathToFileRead).map(String::toLowerCase).filter(str -> str.contains("a")).forEach(System.out::print);
    }
}
