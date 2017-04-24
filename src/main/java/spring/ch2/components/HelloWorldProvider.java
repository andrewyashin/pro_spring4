package spring.ch2.components;

import org.springframework.stereotype.Service;
import spring.ch2.interfaces.MessageProvider;

/**
 * Created by andrew_yashin on 4/22/17.
 */
@Service(value = "provider")
public class HelloWorldProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
