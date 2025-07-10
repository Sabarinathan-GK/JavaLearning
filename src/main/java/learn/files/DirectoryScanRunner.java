package learn.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");
        //Files.list(currentDirectory).forEach(System.out::println);
        //Files.list(Paths.get("./src/main/")).forEach(System.out::println);
        Predicate<? super Path> pathPredicate = path -> String.valueOf(path).contains(".java");
        //Files.walk(currentDirectory,8).filter(pathPredicate).forEach(System.out::println);
        BiPredicate<Path, BasicFileAttributes> javaMatcher = (path,attribute)-> String.valueOf(path).contains(".java");
        BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path,attribute)-> attribute.isDirectory();
        Files.find(currentDirectory,7,javaMatcher).forEach(System.out::println);
    }
}
