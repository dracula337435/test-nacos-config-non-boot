package io.dracula.test.nacos.non.boot;

import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author dk
 */
@ComponentScan
@Configuration
@PropertySource("classpath:io/dracula/test/nacos/non/boot/main.properties")
@EnableNacosConfig
public class MyConfig{

}
