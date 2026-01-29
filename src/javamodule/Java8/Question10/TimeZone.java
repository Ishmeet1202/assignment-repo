package javamodule.Java8.Question10;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZone {

    public static void main(String[] args) {

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usaTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        ZonedDateTime ukTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India Time : " + indiaTime);
        System.out.println("USA Time   : " + usaTime);
        System.out.println("UK Time    : " + ukTime);
    }
}

