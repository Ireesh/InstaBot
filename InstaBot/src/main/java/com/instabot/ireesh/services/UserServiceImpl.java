package com.instabot.ireesh.services;

import com.instabot.ireesh.entities.Role;
import com.instabot.ireesh.entities.Status;
import com.instabot.ireesh.entities.User;
import com.instabot.ireesh.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserByLogin(email);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User '%s' not found", email));
        }

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().name()));


        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
                roles);
    }

    public User findUserByLogin(String email) {
        return userRepository.findUserByLogin(email);
    }

    public boolean createNewUser(String email, String password) {
        if (email != null && password != null) {
            if (userRepository.findUserByLogin(email) == null) {
                User user = new User();
                user.setLogin(email);
                user.setPassword(bCryptPasswordEncoder.encode(password));
                user.setRole(Role.USER);
                user.setStatus(Status.ACTIVE);
                userRepository.save(user);
                return true;
            } else {
                return false;
            }
        } return false;
    }
}
