import java.util.Optional;

public class OptionalsImpl {
    public static void main(String[] args) {
        Optional<Double> average = average(90, 100);
        System.out.println(average.orElse(Double.NaN));
        System.out.println(average.orElseGet(Math::random));
        System.out.println(average.orElseThrow(IllegalStateException::new));


    }
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty(); // строка 1
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length); // строка 2
    }
}
