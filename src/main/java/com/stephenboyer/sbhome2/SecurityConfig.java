package com.stephenboyer.sbhome2;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import javax.inject.Inject;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Inject private SecurityProperties securityProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        if (securityProperties.isRequireSsl()) http.requiresChannel().anyRequest().requiresSecure();
    }
}