package spring.init;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by andrew_yashin on 4/23/17.
 */
@Service("collectionInject")
public class CollectionInject {

    @Resource(name = "map")
    private Map<String, Object> map;

    @Resource(name = "list")
    private List list;

    @Resource(name = "set")
    private Set set;

    public void displayInfo(){
        map.keySet().forEach(k ->
            System.out.println(k + " " + map.get(k)));

        list.forEach(element -> System.out.println(element + " "));

        set.forEach(element -> System.out.println(element + " "));
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("parent.xml");
        context.refresh();

        CollectionInject inject = (CollectionInject) context.getBean("collectionInject");
        inject.displayInfo();

    }
}
