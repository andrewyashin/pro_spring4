package spring.ch5;

import spring.ch5.pointcut.annotations.HelloMethod;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class MessageWriter {
    @HelloMethod
    public void printWorld(){
        System.out.print("World");
    }

    @HelloMethod
    public void printHello(){
        System.out.print("Hello");
    }
}
