package br.net.pnt.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstrates the uses of all the beans configuration properties
 * <p>
 * Created by pedro on 12/5/16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("configuration/beans" +
                ".xml");

        System.out.println(":: Singleton scope tests ::");
        Main.singletonBean(appContext);

        System.out.println("\n:: Prototype scope tests ::");
        Main.prototypeBean(appContext);

    }

    private static void prototypeBean(ApplicationContext appContext) {
        System.out.println("Instantiating prototype bean...");
        SimpleBean prototypeBean = (SimpleBean) appContext.getBean("prototypeBean");
        System.out.println(String.format("Object hashCode %s", prototypeBean.hashCode()));
        prototypeBean.printText();

        System.out.println("Changing bean's text...");
        prototypeBean.setText("Changed the text of the singleton bean.");
        prototypeBean.printText();

        System.out.println("Instantiating prototype bean for second time...");
        SimpleBean anotherPrototypeBean = (SimpleBean) appContext.getBean("prototypeBean");
        System.out.println(String.format("Object hashCode %s", anotherPrototypeBean.hashCode()));
        anotherPrototypeBean.printText();
    }

    public static void singletonBean(ApplicationContext appContext) {
        System.out.println("Instantiating singleton...");
        SimpleBean singletonBean = (SimpleBean) appContext.getBean("singletonBean");
        System.out.println(String.format("Object hashCode %s", singletonBean.hashCode()));
        singletonBean.printText();

        System.out.println("Changing singleton text...");
        singletonBean.setText("Changed the text of the singleton bean.");
        singletonBean.printText();

        System.out.println("Instantiating singleton for second time...");
        SimpleBean anotherSingletonBean = (SimpleBean) appContext.getBean("singletonBean");
        System.out.println(String.format("Object hashCode %s", anotherSingletonBean.hashCode()));
        anotherSingletonBean.printText();
    }
}
