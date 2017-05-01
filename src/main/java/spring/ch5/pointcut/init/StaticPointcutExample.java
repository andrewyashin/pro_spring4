package spring.ch5.pointcut.init;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultBeanFactoryPointcutAdvisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import spring.ch5.MessageWriter;
import spring.ch5.pointcut.SimpleAdvice;
import spring.ch5.pointcut.SimpleStaticPointcut;

/**
 * Created by andrew_yashin on 4/28/17.
 */
public class StaticPointcutExample {
    public static void main(String[] args) {
        MessageWriter writer1 = new MessageWriter();
        MessageWriter writer2 = new MessageWriter();

        MessageWriter proxyWriter1;
        MessageWriter proxyWriter2;

        Pointcut pointcut = new SimpleStaticPointcut();
        Advice advice = new SimpleAdvice();

        Advisor advisor = new DefaultPointcutAdvisor(pointcut, advice);

        ProxyFactory proxyFactory1 = new ProxyFactory();
        proxyFactory1.addAdvisor(advisor);
        proxyFactory1.setTarget(writer1);

        proxyWriter1 = (MessageWriter) proxyFactory1.getProxy();

        proxyFactory1 = new ProxyFactory();
        proxyFactory1.addAdvisor(advisor);
        proxyFactory1.setTarget(writer1);


        proxyWriter2 = (MessageWriter) proxyFactory1.getProxy();

        proxyWriter1.printWorld();
        proxyWriter2.printWorld();

        proxyWriter1.printHello();
        proxyWriter2.printHello();

    }
}
