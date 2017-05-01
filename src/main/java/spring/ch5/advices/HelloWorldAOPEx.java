package spring.ch5.advices;

import org.springframework.aop.framework.ProxyFactory;
import spring.ch5.MessageWriter;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class HelloWorldAOPEx{

    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();

        pf.addAdvice(new SimpleAdviceDecorator());
        pf.setTarget(new MessageWriter());

        MessageWriter writer = (MessageWriter) pf.getProxy();

        writer.printWorld();
    }
}
