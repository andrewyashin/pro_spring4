package spring.ch4.messages;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by andrew_yashin on 4/26/17.
 */
@Component
public class MessageEventListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {
        System.out.println(messageEvent.getMsg() + " received");
    }
}

