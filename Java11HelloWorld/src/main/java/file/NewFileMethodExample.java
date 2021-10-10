package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethodExample {

    public static Path writeFile() throws IOException {
        Path path = Path.of("example.txt");
        String words = "The JAva 11 is coming and going faster";
        final Path pathResult = Files.writeString(path, words);
        return pathResult;
    }

    public static String readFile() throws IOException {
        Path path = Path.of("example.txt");
        return Files.readString(path);
    }
}
