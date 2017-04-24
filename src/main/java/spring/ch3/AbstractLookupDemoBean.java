package spring.ch3;

/**
 * Created by andrew_yashin on 4/24/17.
 */
public abstract class AbstractLookupDemoBean implements DemoBean{
    public abstract MyHelper getHelper();

    @Override
    public void doSomething() {
        getHelper().doSomothingUseful();
    }
}
