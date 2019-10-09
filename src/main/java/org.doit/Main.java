package org.doit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        MessageRenderer renderer = context.getBean("simpleMessageRenderer",MessageRenderer.class);
        renderer.render();


       /* MessageProvider provider = MessageFactory.getProvider();
        MessageRenderer renderer = MessageFactory.getRenderer();
        renderer.render();*/

    }
}
