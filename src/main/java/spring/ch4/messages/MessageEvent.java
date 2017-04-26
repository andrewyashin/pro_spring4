package spring.ch4.messages;

import org.springframework.context.ApplicationEvent;

/**
 * Created by andrew_yashin on 4/26/17.
 */
public class MessageEvent extends ApplicationEvent {
    private String msg;

    public MessageEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
