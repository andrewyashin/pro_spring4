package spring.ch5.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import spring.ch5.MessageWriter;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class SimpleAdviceDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.print("Hello ");
        Object refValue = methodInvocation.proceed();
        System.out.println("!");
        return refValue;
    }

    public static void main(String[] args) {
        MessageWriter messageWriter = new MessageWriter();
        ProxyFactory pf = new ProxyFactory();

        pf.setTarget(messageWriter);
        pf.addAdvice(new SimpleAdviceDecorator());

        MessageWriter messageWriter1 = (MessageWriter) pf.getProxy();
        messageWriter1.printWorld();
    }

}
