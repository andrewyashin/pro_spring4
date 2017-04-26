package spring.ch2.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import spring.ch2.interfaces.MessageProvider;

/**
 * Created by andrew_yashin on 4/23/17.
 */
@Service
public class ConfigurableProvider implements MessageProvider{
    private String message;


    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
