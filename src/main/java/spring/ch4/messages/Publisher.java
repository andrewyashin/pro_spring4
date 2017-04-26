package spring.ch4.messages;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class Publisher implements ApplicationContextAware{
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public void publish(String message){
        context.publishEvent(new MessageEvent(this, "Message"));
    }

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("ch4.xml");
        Publisher publisher = (Publisher) context.getBean("publisher");
        publisher.publish("Hello");
    }
}
