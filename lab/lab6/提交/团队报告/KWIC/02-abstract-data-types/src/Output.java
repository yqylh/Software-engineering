import java.util.List;

/**
 * Created by mejty on 20.3.16.
 */
public interface Output {
    public void writeLines(List<String> lines);
    public void close();
}
