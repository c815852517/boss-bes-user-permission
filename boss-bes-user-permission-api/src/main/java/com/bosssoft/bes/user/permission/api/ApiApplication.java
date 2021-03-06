package com.bosssoft.bes.user.permission.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAspectJAutoProxy
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"utils","com.bosssoft.hr.train.bossbescommonlogging.annotation",
        "com.bosssoft.bes.user.permission.service",
        "com.bosssoft.bes.user.permission.**.controller",
        "utils",
        "annotations"})
@MapperScan(basePackages ="com.bosssoft.bes.user.permission.dao" )
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
