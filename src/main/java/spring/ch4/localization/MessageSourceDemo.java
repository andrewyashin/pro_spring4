package spring.ch4.localization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by andrew_yashin on 4/25/17.
 */
public class MessageSourceDemo {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("ch4.xml");

        Locale english = Locale.ENGLISH;
        Locale czech = new Locale("cs", "CZ");

        System.out.println(context.getMessage("msg", null, english));
        System.out.println(context.getMessage("msg", null, czech));
        System.out.println(context.getMessage("nameMsg", new Object[]{"Chris", "Brown"}, english));
    }

}
