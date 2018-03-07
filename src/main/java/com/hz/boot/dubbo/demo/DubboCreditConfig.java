package com.hz.boot.dubbo.demo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboCreditConfig {

    private final static String APPLICATIONNAME="demo-consumer";

    private final static String REGISTRYADDRESS="127.0.0.1";

    private final static String REGISTRYPROTOCOL="zookeeper";


    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATIONNAME);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(REGISTRYADDRESS);
        registryConfig.setPort(2181);
        registryConfig.setProtocol(REGISTRYPROTOCOL);
        return registryConfig;
    }

}
