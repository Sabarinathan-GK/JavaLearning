package learn.latestfeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./src/main/resources/JavaNewFeatureRead.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);
        String newFileContent = fileContent.replace("Six","Replaced");
        Path newFilePath = Paths.get("./src/main/resources/JavaNewFeatureWrite.txt");
        Files.writeString(newFilePath,newFileContent);
    }
}
