import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by mejty on 7.3.16.
 */
public class FileInput implements Input {
    private String fName;

    public FileInput(String fileName) throws FileNotFoundException {
        fName =  fileName;
    }

    @Override
    public List<String> readAll() throws IOException {
        return Files.readAllLines(Paths.get(fName));
    }
}
