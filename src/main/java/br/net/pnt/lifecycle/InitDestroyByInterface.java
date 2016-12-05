package br.net.pnt.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by pedro on 12/5/16.
 */
public class InitDestroyByInterface implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Executing destroy method of the interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Executing afterPropertiesSet method of the interface");
    }
}
