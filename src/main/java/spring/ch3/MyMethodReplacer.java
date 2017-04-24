package spring.ch3;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/24/17.
 */
public class MyMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(o);
        System.out.println(method);
        return false;
    }
}