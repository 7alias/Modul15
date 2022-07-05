import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TaskStream {

    /*public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) {
                filtered.add(name);
            }
        }

        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }*/
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list
                .stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integers = new ArrayList<>();
        for (String s : strings) {
            integers.add(Integer.parseInt(s));
        }
        int multiply1 = 1;
        for (int i : integers) {
            multiply1 *= i;
        }
        System.out.println(multiply1);


        int multiply = Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(multiply);

        /*Сгенерируйте последовательность чисел от 1 до 100 включительно,
        ограничьте ее последними 50 числами,
        оставьте только те числа,
        которые делятся без остатка на 2 или на 5,
        и посчитайте сумму полученных чисел.
        В ответе у вас должно выйти 2275.
         */
        int n = 100;
        int result =
                IntStream.rangeClosed(51, n)
                        .filter(i -> i % 2 == 0 || i % 5 == 0).sum();

        System.out.println(result);

    }

}


