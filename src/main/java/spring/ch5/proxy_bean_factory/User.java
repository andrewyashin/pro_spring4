package spring.ch5.proxy_bean_factory;

/**
 * Created by andrew_yashin on 5/5/17.
 */

public class User {
    private Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public void print() {
        human.foo(0);
        human.foo(100);
        human.foo(101);
    }
}
