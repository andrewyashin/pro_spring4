package spring.ch2;

import spring.ch2.interfaces.MessageProvider;
import spring.ch2.interfaces.MessageRenderer;

import java.io.FileReader;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory factory;
    static {
        factory = new MessageSupportFactory();
    }
    private MessageProvider provider;
    private MessageRenderer renderer;

    private MessageSupportFactory(){
        Properties properties = new Properties();
        try{
            properties.load(new FileReader("/Volumes/Files 2/java_prj/spring4_example/src/main/resources/msf.properties"));

            provider = (MessageProvider)
                    Class.forName(properties.getProperty("provider.class")).newInstance();
            renderer = (MessageRenderer)
                    Class.forName(properties.getProperty("renderer.class")).newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static MessageSupportFactory getFactory(){
        return factory;
    }

    public MessageRenderer getRenderer(){
        return renderer;
    }

    public MessageProvider getProvider(){
        return provider;
    }

}
