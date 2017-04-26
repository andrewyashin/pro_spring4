package spring.ch4.try_groovy;

/**
 * Created by andrew_yashin on 4/27/17.
 */
public class Contact {
    private String first_name;
    private String surname;

    public Contact() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "first_name='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
