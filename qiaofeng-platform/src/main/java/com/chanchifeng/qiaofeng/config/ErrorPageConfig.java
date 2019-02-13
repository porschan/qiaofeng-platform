package com.chanchifeng.qiaofeng.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author:porschan
 * @description:
 * @date: Created in 17:59 2019/2/13
 * @modified By:
 */
@Configuration
public class ErrorPageConfig {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return factory -> {
//                factory.setPort(8081);
            ErrorPage errorPage = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
            factory.addErrorPages(errorPage);
        };
    }
}
