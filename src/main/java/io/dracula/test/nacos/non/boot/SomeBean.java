package io.dracula.test.nacos.non.boot;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dk
 */
@Component
public class SomeBean {

    @Value("${a}")
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @NacosValue(value="${c}", autoRefreshed=true)
    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
