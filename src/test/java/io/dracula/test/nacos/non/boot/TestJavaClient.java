package io.dracula.test.nacos.non.boot;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Test;

import java.util.Properties;

/**
 * @author dk
 */
public class TestJavaClient {

    @Test
    public void test(){
        try {
            String serverAddr = "localhost:8848";
            String dataId = "example";
//            String group = "DEFAULT_GROUP";
            String group = null;
            Properties properties = new Properties();
            properties.put("serverAddr", serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);
            String content = configService.getConfig(dataId, group, 5000);
            System.out.println(content);
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }

}
