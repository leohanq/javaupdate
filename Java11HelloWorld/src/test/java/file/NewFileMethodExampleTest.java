package file;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

public class NewFileMethodExampleTest {


    @Test
    void whenWrittingFile_thenGetThePath() throws IOException {
        final Path path = NewFileMethodExample.writeFile();
        Assertions.assertEquals("example.txt", path.toString());
    }

    @Test
    void whenReadingFile_thenReadingMessage() throws IOException {
        Path path = Path.of("example.txt");
        final String file = NewFileMethodExample.readFile();
        Assertions.assertEquals("The JAva 11 is coming and going faster", file);

    }
}
