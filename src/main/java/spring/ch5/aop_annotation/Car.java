package spring.ch5.aop_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by andrew_yashin on 5/5/17.
 */
@Component("car")
public class Car {
    private Engine engine;
    private String name;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Value("BMW")
    public void setName(String name) {
        this.name = name;
    }

    public String getCarPower(){
        return name + " - " + engine.getHorsePower();
    }
}
