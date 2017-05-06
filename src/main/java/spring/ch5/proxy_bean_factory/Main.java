package spring.ch5.proxy_bean_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by andrew_yashin on 5/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("ch5.xml");

        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        User user3 = (User) context.getBean("user3");

        user1.print();
        user2.print();
        user3.print();

    }
}
