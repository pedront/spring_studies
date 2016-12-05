package br.net.pnt.lifecycle;

/**
 * Created by pedro on 12/5/16.
 */
public class InitDestroyByXmlConfig {
    public void initBean() {
        System.out.println("Executing init method by xml configuration");
    }

    public void destroyBean() {
        System.out.println("Executing destroy method by xml configuration");
    }
}
