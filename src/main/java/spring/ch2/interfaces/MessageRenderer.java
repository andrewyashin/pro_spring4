package spring.ch2.interfaces;

/**
 * Created by andrew_yashin on 4/22/17.
 */
public interface MessageRenderer {
    void render();
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider provider);
}
