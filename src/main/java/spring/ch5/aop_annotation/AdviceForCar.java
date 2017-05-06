package spring.ch5.aop_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by andrew_yashin on 5/5/17.
 */
@Component
@Aspect
public class AdviceForCar {
    @Pointcut("execution(* spring.ch5.aop_annotation..getHorse*(..))")
    public void getHorsePowerExecution(){}

    @Pointcut("bean(engine*)")
    public void forEngineBeans(){}

    @Before("getHorsePowerExecution() && forEngineBeans()")
    public void before(JoinPoint point){
        System.out.println("Before: " + point.getSignature().getDeclaringTypeName()
                + " " + point.getSignature().getName());
    }

    @AfterReturning("getHorsePowerExecution() && forEngineBeans()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }


    @Around("getHorsePowerExecution() && forEngineBeans()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("Before Around: " + point.getSignature().getDeclaringTypeName()
                +  " " + point.getSignature().getName());

        Object object = point.proceed();

        System.out.println("After Around: " + point.getSignature().getDeclaringTypeName()
                + " " + point.getSignature().getName());

        return object;
    }
}
