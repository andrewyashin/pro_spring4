package spring.ch5.aop_namespace;

<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import spring.ch5.proxy_bean_factory.User;

=======
>>>>>>> 540fbf329480f1336e85b6a8d7c70207c534ad21
/**
 * Created by andrew_yashin on 5/5/17.
 */
public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("ch5_namespace.xml");

        User user = (User) context.getBean("user");
        user.print();
    }
=======
>>>>>>> 540fbf329480f1336e85b6a8d7c70207c534ad21
}
