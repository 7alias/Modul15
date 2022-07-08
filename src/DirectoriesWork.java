import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoriesWork {
    public static void main(String[] args) {

        try {

            Files.createDirectories(Paths.get("animals"));
        } catch (IOException e) {
            // Handle file I/O exception
            System.out.println(e.getMessage());
        }
        String currentLine = null;
        Path path2 = Paths.get("animals/gorilla.txt");

        List<String> data = new ArrayList<>();
        try (BufferedWriter writer = Files.newBufferedWriter(path2, Charset.defaultCharset())) {
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
            System.out.println(Files.isSameFile(Paths.get("animals/gorilla"), Paths.get("animals/gorilla")));

        } catch (IOException e) {
            // Handle file I/O exception
        }
        Path path = Paths.get("animals/gorilla.txt");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) { // Выбираем кодировку файла
            // читаем со стрима

            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }


        } catch (IOException e) {
            // Handle file I/O exception
        }
        ReverseText rt = new ReverseText();
        rt.Reverse("animals/gorilla.txt", "animals/allirog.txt");
    }
}
 class ReverseText{
     void Reverse( String source, String target)
    {
        try{


            File sourceFile=new File(source);

            Scanner content=new Scanner(sourceFile);
            PrintWriter pwriter =new PrintWriter(target);

            while(content.hasNextLine())
            {
                String s=content.nextLine();
                StringBuffer buffer = new StringBuffer(s);
                buffer=buffer.reverse();
                String rs=buffer.toString();
                pwriter.println(rs);
            }
            content.close();
            pwriter.close();
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }

    }
}