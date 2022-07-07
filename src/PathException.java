import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PathException {
    public static void main(String[] args) throws IOException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = formatter.format(LocalDateTime.now());

        Path newDirectoryPath = Paths.get("TMP/XmlReqs");
        Path newFilePath = Paths.get(new StringBuilder().append(newDirectoryPath).append(File.separator).append(date).append("_Req.xml").toString());
        {
            try {
                Files.createDirectories(newDirectoryPath);
                System.out.println("Directory created");

                Files.createFile(newFilePath);
                System.out.println("File created");
            } catch (IOException e) {
            if (Files.exists(newDirectoryPath) && Files.exists(newFilePath)) {
                System.err.println("directory or file already exist: "+ "\n" +  e.getMessage());
            }

            }
        }
    }
}
