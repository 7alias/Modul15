import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DirectoriesWork {
    public static void main(String[] args) {

        try {

            Files.createDirectories(Paths.get("files"));
        } catch (IOException e) {
            // Handle file I/O exception
            System.out.println(e.getMessage());
        }
        String currentLine = null;
        Path path = Paths.get("files/gorilla.txt");

        List<String> data = new ArrayList<>();
        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset())) {
            String a = "";
            for (int j = 1; j < 10; j++) {
                a += j;
                writer.write(a);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(e);
            // Handle file I/O exception
        }


        try {
            System.out.println(Files.isSameFile(Paths.get("files/gorilla"), Paths.get("files/gorilla")));

        } catch (IOException e) {
            // Handle file I/O exception
        }


        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) { // Выбираем кодировку файла
            // читаем со стрима

            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }


        } catch (IOException e) {
            // Handle file I/O exception
        }
        ReverseText rt = new ReverseText();
        rt.Reverse("files/gorilla.txt", "files/allirog.txt");
    }
}

class ReverseText {
    void Reverse(String source, String target) {
        try {
            File sourceFile = new File(source);
            Scanner content = new Scanner(sourceFile);
            PrintWriter pwriter = new PrintWriter(target);
            LinkedList<String> linkedList = new LinkedList<>();
            while (content.hasNextLine())   // сохранить все строки в прямом порядке в linkedList
            {
                String s = content.nextLine();
                StringBuffer buffer = new StringBuffer(s);
                linkedList.add(String.valueOf(buffer));
            }
            Iterator iter = linkedList.descendingIterator();   // объявить итератор в обратном порядке от linkedList
            while (iter.hasNext()) {               // вывести в обратном порядке
                pwriter.println(iter.next().toString());
            }
            content.close();
            pwriter.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}