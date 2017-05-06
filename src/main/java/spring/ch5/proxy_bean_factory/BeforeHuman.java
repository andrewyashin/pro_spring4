package spring.ch5.proxy_bean_factory;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 5/5/17.
 */
public class BeforeHuman implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.print('\n' + method.getName().substring(4));
    }
}
