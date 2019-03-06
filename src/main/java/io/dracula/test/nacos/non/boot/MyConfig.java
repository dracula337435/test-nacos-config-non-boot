package io.dracula.test.nacos.non.boot;

import com.alibaba.nacos.api.annotation.NacosProperties;
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
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
public class MyConfig {
}
