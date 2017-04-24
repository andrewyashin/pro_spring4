package spring.ch2.components;

import org.springframework.stereotype.Service;
import spring.ch2.interfaces.MessageProvider;
import spring.ch2.interfaces.MessageRenderer;

import javax.annotation.Resource;

/**
 * Created by andrew_yashin on 4/22/17.
 */
@Service(value = "renderer")
public class StandardOutputRenderer implements MessageRenderer{
    MessageProvider provider;

    @Override
    public MessageProvider getMessageProvider() {
        return provider;
    }

    @Override
    @Resource(name = "configurable_provider")
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        if(provider != null){
            System.out.println(provider.getMessage());
        }
    }
}
