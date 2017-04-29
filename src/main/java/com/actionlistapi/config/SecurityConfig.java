package com.actionlistapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {

      auth.inMemoryAuthentication()
        .withUser("francis").password("fernandez").roles("USER","ADMIN").and()
        .withUser("rick").password("grimes").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        
        httpSecurity.httpBasic().and()
            .authorizeRequests().antMatchers(HttpMethod.GET).hasRole("USER").and()
            .authorizeRequests().antMatchers(HttpMethod.POST).hasRole("USER").and()
            .authorizeRequests().antMatchers(HttpMethod.PUT, "/actionrequest/**").hasRole("ADMIN").and()
            .authorizeRequests().antMatchers(HttpMethod.PUT, "/preferences/**").hasRole("ADMIN").and()
            .authorizeRequests().antMatchers("/console/*").hasRole("ADMIN");
        
        httpSecurity.csrf().disable();
    
    }
}
