package spring.ch5.pointcut.init;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import spring.ch5.MessageWriter;
import spring.ch5.pointcut.SimpleAdvice;
import spring.ch5.pointcut.annotations.HelloMethod;

/**
 * Created by andrew_yashin on 4/28/17.
 */
public class AnnotationPointcutExample {
    public static void main(String[] args) {
        MessageWriter messageWriter = new MessageWriter();

        Advice advice = new SimpleAdvice();
        AnnotationMatchingPointcut pointcut = AnnotationMatchingPointcut.
                forMethodAnnotation(HelloMethod.class);

        Advisor advisor = new DefaultPointcutAdvisor(pointcut, advice);

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(advisor);
        pf.setTarget(messageWriter);

        MessageWriter messageWriter1 = (MessageWriter) pf.getProxy();

        messageWriter1.printHello();
        messageWriter1.printWorld();

    }
}
