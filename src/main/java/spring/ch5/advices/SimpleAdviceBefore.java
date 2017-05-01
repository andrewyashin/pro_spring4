package spring.ch5.advices;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import spring.ch5.MessageWriter;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class SimpleAdviceBefore implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before Method: " + method.getName());
    }

    public static void main(String[] args) {
        MessageWriter writer = new MessageWriter();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(writer);
        pf.addAdvice(new SimpleAdviceBefore());

        MessageWriter writer1 = (MessageWriter) pf.getProxy();

        writer1.printWorld();
    }
}
