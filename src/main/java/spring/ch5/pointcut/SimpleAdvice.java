package spring.ch5.pointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import spring.ch5.advices.SimpleAdviceBefore;

/**
 * Created by andrew_yashin on 4/28/17.
 */
public class SimpleAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Invocation");
        Object object = methodInvocation.proceed();
        System.out.println("End");
        return object;
    }
}
