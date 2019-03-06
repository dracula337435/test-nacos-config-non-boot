package io.dracula.test.nacos.non.boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author dk
 */
@ComponentScan
@Configuration
@PropertySource("classpath:io/dracula/test/nacos/non/boot/main.properties")
public class MyConfig{

}
