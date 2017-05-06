package spring.ch5.aop_namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import spring.ch5.proxy_bean_factory.User;

/**
 * Created by andrew_yashin on 5/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("ch5_namespace.xml");

        User user = (User) context.getBean("user");
        user.print();
    }
}
