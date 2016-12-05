package br.net.pnt.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pedro on 12/5/16.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("lifecycle/beans.xml");

        System.out.println(":: Instantiating class with initialize/destroy interface ::");
        InitDestroyByInterface beanByInterface = (InitDestroyByInterface) appContext.getBean("beanByInterface");

        System.out.println(":: Instantiating class with init/destroy xml configuration ::");
        InitDestroyByXmlConfig beanByXml = (InitDestroyByXmlConfig) appContext.getBean
                ("beanByXml");

        System.out.println(":: Instantiating class with default init/destroy xml configuration ::");
        InitDestroyByDefaultConfig beanByDefaultConfig = (InitDestroyByDefaultConfig) appContext
                .getBean
                        ("beanByDefaultConfig");

        appContext.registerShutdownHook();
    }
}
