package br.net.pnt.lifecycle;

/**
 * Created by pedro on 12/5/16.
 */
public class InitDestroyByDefaultConfig {
    public void init() {
        System.out.println("Executing init method by default configuration");
    }

    public void destroy() {
        System.out.println("Executing destroy method by default configuration");
    }
}
