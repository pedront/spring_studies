package br.net.pnt.helloworld.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class demonstrating a simple Spring object instantiation using xml configuration file
 *
 * Created by pedro on 12/5/16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("helloworld/xml/beans.xml");
        HelloWord helloWorld = (HelloWord) appContext.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
