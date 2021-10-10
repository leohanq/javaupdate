package write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteStringExample {


    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static void readFile() throws IOException {
        var data = Files.readString(Path.of("word.txt"));
        System.out.println(data);
    }

    private static void writeFile() throws IOException {
        var words = "forest\nwood\nsky\nrock";
        Files.writeString(Path.of("word.txt"), words);
    }
}
