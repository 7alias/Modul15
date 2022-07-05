import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAdditional {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s
                .filter(x -> x.startsWith("m")) // оставляем лишь элементы начинающиеся с m
                .forEach(System.out::println); // monkey


        Stream<String> stream = Stream.of("duck", "duck", "duck", "goose");
        stream
                .distinct() // оставляем уникальные элементы
                .forEach(System.out::println); // duckgoose


        Stream<Integer> str = Stream.iterate(1, n -> n + 1);
        str
                .skip(5) // пропускаем первые 5 элементов
                .limit(2) // ограничиваем данные 2 элементами
                .forEach(System.out::print); // 67
        System.out.println();

        Stream<String> stream1 = Stream.of("monkey", "gorilla", "bonobo");
        stream1
                .map(String::length) // трансформируем строки в их длины, получаем Stream<Integer>
                .forEach(System.out::print); // 676

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("bonobo");
        List<String> two = Arrays.asList("mama gorilla", "baby gorilla");

        Stream<List<String>> animals = Stream.of(zero, one, two);
        Stream<String> stringStream = animals.flatMap(list -> list.stream());
        stringStream.forEach(System.out::print); // bonobomama gorillababy gorilla
    }
}
