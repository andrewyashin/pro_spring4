package spring.ch5.proxy_bean_factory;

/**
 * Created by andrew_yashin on 5/5/17.
 */
public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void foo(int value){
        System.out.println(value);
    }
}
