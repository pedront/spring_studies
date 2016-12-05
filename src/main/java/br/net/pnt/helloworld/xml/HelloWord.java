package br.net.pnt.helloworld.xml;

/**
 * HelloWorld bean
 *
 * Created by pedro on 12/5/16.
 */
public class HelloWord {
    private String message;

    public void getMessage() {
        System.out.println(String.format("Your message: %s", message));
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
