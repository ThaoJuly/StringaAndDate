import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Set;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime ldt = LocalDateTime.of(2021, 8, 20, 10, 0, 0);
        System.out.println(ldt);
        System.out.println("-------------");

        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("-------------");


        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(f));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("d/MMMM/yyyy");
        System.out.println(now.format(f2));

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEEE");
        System.out.println(now.format(f3));
        System.out.println("-------------");

//        String strD = "20/8/2012";
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/MM/yyyy");
//        LocalDate ld = LocalDate.parse(strD, df);
//        System.out.println(ld);
//        System.out.println("-------------");

//        Set<String> zones = ZoneId.getAvailableZoneIds();
//        for (String z : zones) {
//            System.out.println(z);
//        }
//
//        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Etc/GMT+8"));
//        System.out.println(zdt);

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2021, 12, 12);
        Period p = Period.between(d1,d2);
        System.out.println(p);



    }
//    public static void main(String[] args){
//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        System.out.println("--------------------");
//    }

//    public static void main(String[] args) {
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
//        System.out.println("---------------");
//
//        LocalTime lt = LocalTime.of(9,30,45);
//        System.out.println(lt);
//        System.out.println("---------------");
//
//        LocalTime lt2 = LocalTime.ofSecondOfDay(60);
//        System.out.println(lt2);
//        System.out.println("---------------");
//
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//        System.out.println(now.getSecond());
//        System.out.println(now.getNano());
//        System.out.println("---------------");
//
//        System.out.println(now.plusHours(10));
//        System.out.println(now.plusMinutes(2));
//        System.out.println(now.plusSeconds(1));
//        System.out.println(now.plusNanos(10));
//        System.out.println("---------------");
//    }
}

