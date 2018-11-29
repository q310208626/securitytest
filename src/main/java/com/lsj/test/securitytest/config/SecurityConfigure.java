package com.lsj.test.securitytest.config;

import com.lsj.test.securitytest.security.MyPasswordEncoder;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @descriptions: spring security config
 * @version: v1.0.0
 * @author: linsj3
 * @create: 2018-11-27 17:22
 **/
@EnableWebSecurity
@Configuration
public class SecurityConfigure extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/home").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login.do").permitAll()
                .and()
                .logout().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).withUser("user1").password("password1").roles("USER")
                .and().passwordEncoder(new MyPasswordEncoder()).withUser("admin1").password("password1").roles("ADMIN");
    }
}
