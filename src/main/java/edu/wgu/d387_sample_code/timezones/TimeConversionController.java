package edu.wgu.d387_sample_code.timezones;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/timezones")
public class TimeConversionController {

    private TimeConversion timeConversion;

    @Autowired
    public TimeConversionController(TimeConversion timeConversion) {
        this.timeConversion = timeConversion;

    }

    @GetMapping
    public ResponseEntity<Map<String, String>> getTimeConversion() {
        String timeZones =  timeConversion.getTimeZones();
        return ResponseEntity.ok(Map.of("times", timeZones));
    }

}
