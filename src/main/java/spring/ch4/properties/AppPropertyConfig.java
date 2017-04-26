package spring.ch4.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by andrew_yashin on 4/27/17.
 */
@Configuration
public class AppPropertyConfig {
    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Bean("appProperty")
    public AppProperty appProperty(){
        return new AppProperty(environment.getProperty("HOME"),
                environment.getProperty("PWD"));
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppPropertyConfig.class);

        AppProperty property = context.getBean("appProperty", AppProperty.class);
        System.out.println(property.getJava_home());
        System.out.println(property.getUser_home());
    }
}
