package spring.ch5.aop_annotation;

<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by andrew_yashin on 5/5/17.
 */
@Configuration
@ComponentScan(value = "spring.ch5.aop_annotation")
public class Config {


    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("ch5_annotation.xml");

        Car car = (Car) context.getBean("car");
        System.out.println(car.getCarPower());


    }
}
=======
/**
 * Created by andrew_yashin on 5/5/17.
 */
public class Config {
}
>>>>>>> 540fbf329480f1336e85b6a8d7c70207c534ad21
