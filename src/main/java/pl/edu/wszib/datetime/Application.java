package pl.edu.wszib.datetime;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Application {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println("Day of month = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Date original = " + date);
        System.out.println("Date from calendar = " + calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH, 21);
        System.out.println("Day of month = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Date original = " + date);
        System.out.println("Date from calendar = " + calendar.getTime());
        // JodaTime: https://www.joda.org/joda-time/

        System.out.println();
        System.out.println();
        System.out.println("Calendar = " + calendar.getTime());
        calculate(calendar);
        System.out.println("Calendar = " + calendar.getTime());

        // zad1. wszystkie info o aktualnej dacie

        calendar = Calendar.getInstance();
        System.out.println("\nZad 1");
        System.out.println("Day of month = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of year = " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of AM = " + calendar.get(Calendar.AM));
        System.out.println("Day of date = " + calendar.get(Calendar.DATE));
        System.out.println("Day of DAY_OF_WEEK = " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of AM_PM = " + calendar.get(Calendar.AM_PM));
        System.out.println("Day of ERA = " + calendar.get(Calendar.ERA));
        System.out.println("Day of LONG_FORMAT = " + calendar.get(Calendar.LONG_FORMAT));
        System.out.println("Day of HOUR = " + calendar.get(Calendar.HOUR));
        System.out.println("Day of HOUR_OF_DAY = " + calendar.get(Calendar.HOUR_OF_DAY));
        //System.out.println("Day of LONG_STANDALONE = " + calendar.get(Calendar.LONG_STANDALONE));
        System.out.println("Day of MILLISECOND = " + calendar.get(Calendar.MILLISECOND));
        System.out.println("Day of MINUTE = " + calendar.get(Calendar.MINUTE));
        System.out.println("Day of YEAR = " + calendar.get(Calendar.YEAR));
        System.out.println("Day of toString = " + calendar.toString());

        // zad2- pobierz aktualny czas w strefie czasowej New York
        System.out.println("\nZad 1");
        calendar = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("America/New_York")));
        System.out.println("for New York = " + calendar.toString());



    }

    private static Integer calculate(Calendar calendar) {
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + 7);
        // jakaś kalkulacja
        return 10;
    }

    public record Pair(Calendar from, Calendar to) {

    }
}
