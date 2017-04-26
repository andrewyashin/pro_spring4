package spring.ch4.try_groovy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class AppConfig {
    public static void main(String[] args) {
        ApplicationContext context =
                new GenericGroovyApplicationContext("config.groovy");
    }
}
