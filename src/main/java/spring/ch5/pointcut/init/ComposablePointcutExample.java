package spring.ch5.pointcut.init;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcher;
import spring.ch5.SampleBean;
import spring.ch5.advices.SimpleAdviceBefore;

import java.lang.reflect.Method;

/**
 * Created by andrew_yashin on 4/28/17.
 */
public class ComposablePointcutExample {

    public static void main(String[] args) {
        SampleBean sampleBean = new SampleBean();

        ComposablePointcut pointcut = new ComposablePointcut(new GetterMethodMatcher());

        System.out.println("test1");
        SampleBean proxyBean = getProxy(pointcut, sampleBean);
        testInvoke(proxyBean);


        System.out.println("test2");
        pointcut.union(new SetterMethodMatcher());
         proxyBean = getProxy(pointcut, sampleBean);
        testInvoke(proxyBean);



        System.out.println("test3");
        pointcut.union(new GetAgeMethodMatcher());
         proxyBean = getProxy(pointcut, sampleBean);
        testInvoke(proxyBean);

        System.out.println("test4");
        pointcut.intersection(new GetterMethodMatcher());
        proxyBean = getProxy(pointcut, sampleBean);
        testInvoke(proxyBean);

        System.out.println("test5");
        pointcut.intersection(new SetterMethodMatcher());
        proxyBean = getProxy(pointcut, sampleBean);
        testInvoke(proxyBean);

        System.out.println("test6");
        pointcut.intersection(new GetAgeMethodMatcher());
        proxyBean = getProxy(pointcut, sampleBean);
        testInvoke(proxyBean);

    }

    public static class GetterMethodMatcher extends StaticMethodMatcher{
        @Override
        public boolean matches(Method method, Class<?> aClass) {
            return (method.getName().startsWith("get"));
        }
    }

    public static class SetterMethodMatcher extends StaticMethodMatcher{
        @Override
        public boolean matches(Method method, Class<?> aClass) {
            return (method.getName().startsWith("set"));
        }
    }

    public static class GetAgeMethodMatcher extends StaticMethodMatcher{
        @Override
        public boolean matches(Method method, Class<?> aClass) {
            return ("getAge".equals(method.getName()));
        }
    }

    public static SampleBean getProxy(ComposablePointcut pc, SampleBean target){
        Advice advice = new SimpleAdviceBefore();
        Advisor advisor = new DefaultPointcutAdvisor(pc, advice);
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        return (SampleBean) pf.getProxy();
    }

    public static void testInvoke(SampleBean proxyBean){
        proxyBean.getAge();
        proxyBean.getName();
        proxyBean.setName("Andrew");
    }
}
