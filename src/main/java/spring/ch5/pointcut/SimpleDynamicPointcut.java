package spring.ch5.pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import spring.ch5.MessageWriter;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/28/17.
 */
public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut{

    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        return true;
    }

    @Override
    public ClassFilter getClassFilter() {
        return clazz -> (clazz == MessageWriter.class);
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return ("printWorld".matches(method.getName()));
    }
}
