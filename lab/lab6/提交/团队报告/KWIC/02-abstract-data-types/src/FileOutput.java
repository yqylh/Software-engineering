import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by mejty on 20.3.16.
 */
public class FileOutput implements Output {

    private PrintWriter out;

    public FileOutput(String filename) throws FileNotFoundException {
        out = new PrintWriter(filename);
    }

    @Override
    public void writeLines(List<String> lines) {
        lines.forEach(out::println);
    }

    @Override
    public void close() {
        out.close();
    }
}
