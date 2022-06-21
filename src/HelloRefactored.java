import java.util.Optional;

public class HelloRefactored {


    public static void main(String[] args) {
        String text = "Hello";
        Optional<String> opt = Optional.ofNullable(refactorText(text)); // строка 1
        //System.out.println(opt.orElse(new IllegalStateException())); // строка 2
    }

    private static String refactorText(String text) {
        if (text.length() >= 5) {
            return null;
        } else {
            return text + " refactored";
        }
    }
}
