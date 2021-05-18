package cz.cvut.fel.ass.kwic.implicitInvocation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author klimesf
 */
class Output {
    void writeFile(Lines lines, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (String line : lines.all()) {
            fileWriter.append(line).append('\n');
        }
        fileWriter.flush();
    }
}
