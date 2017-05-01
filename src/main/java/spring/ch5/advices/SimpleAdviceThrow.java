package spring.ch5.advices;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;
import spring.ch5.ErrorBean;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class SimpleAdviceThrow implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable{
        System.out.println("Catch Exception: " + ex.getClass());
    }

    public void afterThrowing(Method method, Object[] args, Object target, RuntimeException ex)
            throws Throwable{
        System.out.println("Catch Exception: " + ex.getClass());
        System.out.println("In object: " + target.getClass());
        System.out.println("In method: " + method.getName());
    }

    public static void main(String[] args) {
        ErrorBean errorBean = new ErrorBean();
        ProxyFactory pf = new ProxyFactory();

        pf.addAdvice(new SimpleAdviceThrow());
        pf.setTarget(errorBean);

        ErrorBean errorBean1 = (ErrorBean) pf.getProxy();

        try{
            errorBean1.throwsSimpleException();
        } catch (Exception e){

        }

        try {
            errorBean1.throwsRuntimeException();
        } catch (Exception e){

        }
    }
}
