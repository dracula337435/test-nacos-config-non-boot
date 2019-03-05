package io.dracula.test.nacos.non.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author dk
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("io/dracula/test/nacos/non/boot/main.xml");
        ac.start();
        SomeBean someBean = ac.getBean(SomeBean.class);
        System.out.println(someBean.getA());
//        System.in.read();
    }

}
