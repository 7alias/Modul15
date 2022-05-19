
import java.util.function.Consumer;


public class Lambda {



    public static void main(String[] args) {
        task(12, value->{});
    }

    private static void task(int value, Consumer<Integer> param) {} // вставьте тип

    private static void test(Integer value) {
        System.out.println("ok");
    }
}

