package spring.ch5.advices;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;
import spring.ch5.MessageWriter;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class SimpleAdviceAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1)
            throws Throwable {
        System.out.println("After Method: " + method.getName());
        System.out.println("Return Value: " + returnValue);
    }

    public static void main(String[] args) {
        MessageWriter messageWriter = new MessageWriter();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleAdviceAfter());
        pf.setTarget(messageWriter);

        MessageWriter messageWriter1 = (MessageWriter) pf.getProxy();

        messageWriter1.printWorld();
        messageWriter1.printHello();
    }
}
