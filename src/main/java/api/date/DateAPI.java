package api.date;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

public class DateAPI {
    public static void main(String[] args) {
        period();
        duration();
        modernTimestamp();
        /*
        Duration and Period are used with LocalDateTime for ease addition and subtraction of time
        */
    }

    private static void period(){
        Period fiveYearTenMonthsTwoDays = Period.ofYears(5)
                .plusMonths(10)
                .plusDays(2);
        System.out.println(fiveYearTenMonthsTwoDays);
    }

    private static void duration(){
        Duration sixHourNineteenMinutesFourSecond = Duration.ofHours(6)
                .plusMinutes(19)
                .plusSeconds(4);
        System.out.println(sixHourNineteenMinutesFourSecond);
    }

    private static void modernTimestamp(){
        System.out.println(Instant.now());
    }
}
