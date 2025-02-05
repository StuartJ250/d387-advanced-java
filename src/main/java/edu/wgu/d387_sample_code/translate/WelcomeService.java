package edu.wgu.d387_sample_code.translate;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
import java.util.ResourceBundle;


public class WelcomeService extends Thread {

    private final Locale locale;
    @Getter
    @Setter
    private String message;

    public WelcomeService(Locale locale) {
        this.locale = locale;
    }

    @Override
    public void run(){

        ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
        this.message = bundle.getString("welcome");
    }

}
