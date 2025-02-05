package edu.wgu.d387_sample_code.translate;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/welcome")
public class WelcomeController {

    @GetMapping
    public Map<String, String> getWelcome() {

        WelcomeService englishThread = new WelcomeService(new Locale("en", "CA"));
        WelcomeService frenchThread = new WelcomeService(new Locale("fr", "CA"));

        englishThread.start();
        frenchThread.start();

        try{
            englishThread.join();
            frenchThread.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        Map<String, String> welcome = new HashMap<>();
        welcome.put("english", englishThread.getMessage());
        welcome.put("french", frenchThread.getMessage());
        return welcome;

    }


}
