package spring.ch4;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("prototype")
public class MyCustomBean implements BeanNameAware {
    private String id;
    private String beanName;

    public MyCustomBean(){
        System.out.println("Constructor()");
    }

    @Autowired
    public void setId(String id){
        System.out.println("setId");
        this.id = id;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName");
        beanName = s;
    }

    @PostConstruct
    public void indInit(){
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroyed");
    }

    public void printBeanAndId(){
        System.out.println(beanName + " = " + id);
    }


    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("ch4.xml");

        MyCustomBean customBean = (MyCustomBean) context.getBean("customBean");
        customBean.printBeanAndId();
    }
}
