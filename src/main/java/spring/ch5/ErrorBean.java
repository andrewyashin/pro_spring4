package spring.ch5;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class ErrorBean {
    public void throwsSimpleException() throws Exception{
        throw new Exception();
    }

    public void throwsRuntimeException() {
        throw new RuntimeException();
    }
}
