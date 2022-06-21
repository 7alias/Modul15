import java.util.Optional;

public class HelloTest {
    public static void main(String[] args) {
        String hello = "Hello";
        Optional<String> opt = Optional.ofNullable(hello); // строка 1
        hello = null;
        opt.ifPresent(System.out::println);
    }
}
