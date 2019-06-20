package dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localDate {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.of(2019,9,1);
        System.out.println(localDate.getDayOfWeek());

        LocalDate localDate1 = LocalDate.parse("2019-08-31");
        System.out.println(localDate1.getDayOfWeek());


        //***************************************************

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //***************************************************

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
