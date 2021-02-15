package com.instabot.ireesh.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean createNewUser(String email, String password);
}
