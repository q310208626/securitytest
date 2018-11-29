package com.lsj.test.securitytest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * @descriptions:
 * @version: v1.0.0
 * @author: linsj3
 * @create: 2018-11-29 10:55
 **/
public class LoginAuthenticationProvider implements AuthenticationProvider {

    @Bean
    public LoginAuthenticationProvider LoginAuthenticationProvider(){
        return new LoginAuthenticationProvider();
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
