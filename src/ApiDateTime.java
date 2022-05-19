import java.time.*;

public class ApiDateTime {


    public static void main(String[] args) {

/*
        System.out.println(LocalDate.now());    // 2007-12-03
        System.out.println(LocalTime.now()); //	10:15:30
        System.out.println(LocalDateTime.now());    //2007-12-03T10:15:30
        System.out.println(ZonedDateTime.now());    //2007-12-03T10:15:30+01:00 Europe/Paris

//        System.out.println(ZoneId.getAvailableZoneIds());
  */


        System.out.println(ZonedDateTime.of(LocalDate.from(LocalDateTime.now()), LocalTime.now(), ZoneId.systemDefault()));
        LocalTime time = LocalTime.of(16, 30); // строка 1
        LocalTime newTime = time.withHour(14).plusMinutes(15);
        System.out.println(time);


        System.out.println(newTime);

    }


}
