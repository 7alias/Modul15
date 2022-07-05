import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTask {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty(); // пустой стрим
        Stream<Integer> singleElement = Stream.of(1); // длина 1
        Stream<Integer> anyElements = Stream.of(1, 2, 3); // длина 3
        Stream<Integer> fromArray = Arrays.stream(new Integer[]{1, 2, 3}); // длина 3

        //List stream
//        List<String> list = Arrays.asList("a", "b", "c");
//        Stream<String> listStream = list.stream();

        Stream<Double> randoms = Stream.generate(Math::random);
        // генератор рандомных чисел
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        // последовательность нечетных чисел.
        // 1 - первое число ряда

        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp"); // бесконечный стрим строки
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0)); // проверка - первый символ - буква
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3

        Stream<String> st = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = st.min((s1, s2) -> s1.length() - s2.length());
// минимум по длине
        min.ifPresent(System.out::println); // ape

        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> inf = Stream.generate(() -> "chimp");
        stream.findAny().ifPresent(System.out::println); // monkey
        inf.findAny().ifPresent(System.out::println); // chimp

        Stream<String> printable = Stream.of("Monkey", "Gorilla", "Bonobo");
        printable.forEach(System.out::print); // MonkeyGorillaBonobo
        System.out.println();

        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        String word = stringStream.reduce("", (b, c) -> b + c);
        System.out.println(word); // wolf

        Stream<String> collectStream = Stream.of("w", "o", "l", "f");
        StringBuilder wolfBuilder = collectStream.collect(StringBuilder::new,StringBuilder::append, StringBuilder::append);
        String wolf = wolfBuilder.toString();
        System.out.println(wolf); // wolf

        Optional<Integer> optional = Optional.empty();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println(optional.orElseGet(() -> 5)); // строка 1
        }
        Stream<Integer> infinite1 = Stream.iterate(2, x -> x * 2);
        System.out.println(infinite1.anyMatch(test -> test / 8 == 0));

        Stream<Long> stream2 = Stream.iterate(0L, l -> l + 100);
        boolean match = stream2.allMatch(elem -> elem % 100 == 0);
        System.out.println(match);

    }
}
