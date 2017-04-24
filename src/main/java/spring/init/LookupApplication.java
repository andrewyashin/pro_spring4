package spring.init;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import spring.ch3.AbstractLookupDemoBean;
import spring.ch3.DemoBean;
import spring.ch3.StandardLookupDemoBean;

/**
 * Created by andrew_yashin on 4/24/17.
 */
public class LookupApplication {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("lookup.xml");
        context.refresh();

        DemoBean demoBean = (AbstractLookupDemoBean) context.getBean("abstractLookup");
        DemoBean demoBean1 = (StandardLookupDemoBean) context.getBean("standardLookup");

        demoBean.doSomething();
        demoBean1.doSomething();

        System.out.println(demoBean.getHelper() == demoBean.getHelper());
        System.out.println(demoBean1.getHelper() == demoBean1.getHelper());

    }
}
