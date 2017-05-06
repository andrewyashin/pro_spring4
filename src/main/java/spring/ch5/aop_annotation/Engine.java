package spring.ch5.aop_annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by andrew_yashin on 5/5/17.
 */
@Component
@Qualifier("engine")
public class Engine {
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
