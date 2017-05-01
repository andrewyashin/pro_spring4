package spring.ch5.pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import spring.ch5.MessageWriter;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/28/17.
 */
public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                return (aClass == MessageWriter.class);
            }
        };
    }

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return "printWorld".matches(method.getName());
    }


}
