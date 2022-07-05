import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNio {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("./../documents/./doc.txt").toRealPath();
            System.out.println(path);
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
