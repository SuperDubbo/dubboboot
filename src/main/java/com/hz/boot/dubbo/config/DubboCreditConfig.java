package com.hz.boot.dubbo.config;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashSet;

@Configuration
public class DubboCreditConfig {

    private final static String APPLICATIONNAME="demo-consumer";

    private final static String REGISTRYADDRESS="127.0.0.1";

    private final static String REGISTRYPROTOCOL="zookeeper";

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATIONNAME);
        applicationConfig.setDefault(true);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(REGISTRYADDRESS);
        registryConfig.setPort(2181);
        registryConfig.setProtocol(REGISTRYPROTOCOL);
        registryConfig.setCheck(false);
        registryConfig.setId("registry");
        registryConfig.setDefault(true);
        return registryConfig;
    }

    @Bean
    public ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor(){
        LinkedHashSet<String> basePackages=new LinkedHashSet<String>();
        basePackages.add("com.hz.impl");
        basePackages.add("com.hz.boot.dubbo");
        return new ServiceAnnotationBeanPostProcessor(basePackages);
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setId("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
