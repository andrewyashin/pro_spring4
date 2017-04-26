package spring.ch3;

/**
 * Created by andrew_yashin on 4/24/17.
 */
public class StandardLookupDemoBean implements DemoBean {
    private MyHelper helper;

    public void setHelper(MyHelper helper){
        this.helper = helper;
    }

    @Override
    public MyHelper getHelper() {
        return helper;
    }

    @Override
    public void doSomething() {
        helper.doSomethingUseful();
    }
}
