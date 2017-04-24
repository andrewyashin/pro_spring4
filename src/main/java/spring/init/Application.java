package spring.init;

import org.springframework.context.support.GenericXmlApplicationContext;
import spring.ch2.interfaces.MessageRenderer;

/**
 * Created by andrew_yashin on 4/22/17.
 */
public class Application {
    public static void main(String[] args) {
        GenericXmlApplicationContext contextParent = new GenericXmlApplicationContext();
        contextParent.load("parent.xml");
        contextParent.refresh();

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("config.xml");
        context.setParent(contextParent);
        context.refresh();

        MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");
        renderer.render();
    }
}
