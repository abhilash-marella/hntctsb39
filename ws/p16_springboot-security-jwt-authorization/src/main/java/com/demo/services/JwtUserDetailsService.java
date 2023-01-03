package com.demo.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // find user from database where user = :username
        // userRepo.findByUsername(username);// username, password, roles
        if ("user1".equals(username)) {
            Set<SimpleGrantedAuthority> authorities = new HashSet<SimpleGrantedAuthority>();
	        authorities.add(new SimpleGrantedAuthority("ROLE_" + "ADMIN"));
            return new User(
                    "user1",
                    "$2a$10$5Q/UZBQH.ArDrvXZfIZrveep0Im/E6rdGRj17uEROHDzRqcWYdI1O",
                    authorities
                );
            } else if ("user2".equals(username)) {
                Set<SimpleGrantedAuthority> authorities = new HashSet<SimpleGrantedAuthority>();
    	        authorities.add(new SimpleGrantedAuthority("ROLE_" + "SELLER"));
                authorities.add(new SimpleGrantedAuthority("ROLE_" + "BUYER"));
                return new User(
                        "user2",
                        "$2a$10$5Q/UZBQH.ArDrvXZfIZrveep0Im/E6rdGRj17uEROHDzRqcWYdI1O",
                        authorities
                    );
            } else if ("user3".equals(username)) {
                Set<SimpleGrantedAuthority> authorities = new HashSet<SimpleGrantedAuthority>();
                authorities.add(new SimpleGrantedAuthority("ROLE_" + "BUYER"));
                return new User(
                        "user3",
                        "$2a$10$5Q/UZBQH.ArDrvXZfIZrveep0Im/E6rdGRj17uEROHDzRqcWYdI1O",
                        authorities
                    );
            } else {
                throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}