package spring.ch5.proxy_bean_factory;

<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

=======
>>>>>>> 540fbf329480f1336e85b6a8d7c70207c534ad21
/**
 * Created by andrew_yashin on 5/5/17.
 */
public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("ch5.xml");

        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        User user3 = (User) context.getBean("user3");

        user1.print();
        user2.print();
        user3.print();

    }
=======
>>>>>>> 540fbf329480f1336e85b6a8d7c70207c534ad21
}
