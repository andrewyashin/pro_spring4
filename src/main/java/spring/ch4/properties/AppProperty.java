package spring.ch4.properties;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class AppProperty {
    private String user_home;
    private String java_home;

    public AppProperty(String user_home, String java_home) {
        this.user_home = user_home;
        this.java_home = java_home;
    }

    public String getUser_home() {
        return user_home;
    }

    public String getJava_home() {
        return java_home;
    }
}
