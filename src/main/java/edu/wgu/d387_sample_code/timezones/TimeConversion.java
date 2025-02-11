package edu.wgu.d387_sample_code.timezones;

import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TimeConversion {


    public String getTimeZones() {
        ZoneId easternTimeZone = ZoneId.of("America/New_York");
        ZoneId mountainTimeZone = ZoneId.of("America/Denver");
        ZoneId universalTimeZone = ZoneId.of("UTC");

        ZonedDateTime eastNow = ZonedDateTime.now(easternTimeZone);
        ZonedDateTime mountainNow = eastNow.withZoneSameInstant(mountainTimeZone);
        ZonedDateTime universalNow = mountainNow.withZoneSameInstant(universalTimeZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String formattedEast = eastNow.format(formatter);
        String formattedMountain = mountainNow.format(formatter);
        String formattedUniversal = universalNow.format(formatter);

        return "ET: " + formattedEast + " MT: " + formattedMountain + " UTC: " + formattedUniversal;

    }


}
