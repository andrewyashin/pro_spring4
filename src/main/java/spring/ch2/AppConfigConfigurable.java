package spring.ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import spring.ch2.components.ConfigurableProvider;
import spring.ch2.components.StandardOutputRenderer;
import spring.ch2.interfaces.MessageProvider;
import spring.ch2.interfaces.MessageRenderer;


@Configuration
@PropertySource(value = "classpath:messages.properties")
@ComponentScan(value = "spring.ch2.components")
@Profile("configurable")
public class AppConfigConfigurable {
    @Autowired
    Environment environment;

    @Bean
    @Lazy
    public MessageProvider messageProvider(){
        ConfigurableProvider provider = new ConfigurableProvider();
        provider.setMessage(environment.getProperty("message"));
        return provider;
    }

    @Bean(value = "messageRenderer")
    @DependsOn(value = "messageProvider")
    @Scope("prototype")
    public MessageRenderer messageRenderer(){
        StandardOutputRenderer renderer = new StandardOutputRenderer();
        renderer.setMessageProvider(messageProvider());
        return renderer;
    }
}
