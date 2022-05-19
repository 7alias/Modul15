import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task15_1_3 {
    /*Задание 15.1.3
    Напишите метод, который будет принимать 2 объекта: 1 типа
    LocalTime и 2 типа
    Duration, и будет возвращать true, если переданное время + промежуток больше текущего времени.*/

    public static void main(String[] args) {

        Task15_1_3 task15_1_3 = new Task15_1_3();
        System.out.println(task15_1_3.timeCheck(LocalTime.now(), Duration.ofHours(1) ));

    }

    public boolean timeCheck(LocalTime localTime, Duration duration) {
        LocalTime nowTime = LocalTime.now();
//        if (nowTime < (localTime.plusHours(duration.toHoursPart())) {
            return true;
//        } else {
//            return false;
//        }
    }
}
