package org.zerock.jex01.security.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Log4j2
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        log.warn("CustomUserDetailsService----------------------------");
        log.warn("CustomUserDetailsService----------------------------");
        log.warn(username);
        log.warn("CustomUserDetailsService----------------------------");
        log.warn("CustomUserDetailsService----------------------------");
        log.warn("CustomUserDetailsService----------------------------");

        User result = (User) User.builder()
                .username(username)
                .password("$2a$10$xTFFWIDBh8PXAqR3vlagmODlN/rPxXDkZo67MPDtXAMRQUAPMVFPK")
                .accountExpired(false)
                .accountLocked(false)
                .authorities("ROLE_MEMBER", "ROLE_ADMIN")
                .build();

        return result;
    }
}
