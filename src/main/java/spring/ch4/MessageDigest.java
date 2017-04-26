package spring.ch4;

/**
 * Created by andrew_yashin on 4/24/17.
 */
public class MessageDigest {
    private String algorithmCoding;
    private MessageDigest(String algorithmCoding){
        this.algorithmCoding = algorithmCoding;
    }

    public static MessageDigest getInstance(String algorithmCoding){
        return new MessageDigest(algorithmCoding);
    }

    public String getAlgorithm(){
        return algorithmCoding;
    }
}
