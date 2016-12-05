package br.net.pnt.configuration;

/**
 * Created by pedro on 12/5/16.
 */
public class SimpleBean {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(String.format("The text is: %s\n", text));
    }
}
