package com.lsj.test.securitytest.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @descriptions:
 * @version: v1.0.0
 * @author: linsj3
 * @create: 2018-11-29 11:59
 **/
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        if(rawPassword.equals(encodedPassword)){
            return true;
        }
        return false;
    }
}
