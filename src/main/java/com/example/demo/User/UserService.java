package com.example.demo.User;

import com.example.demo.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;
    }
    public SiteUser getUser(String username){
        Optional<SiteUser> optionalSiteUser = this.userRepository.findByusername(username);
        if(optionalSiteUser.isPresent()){
            return optionalSiteUser.get();
        }else {
            throw new DataNotFoundException("siteUser not found");
        }
    }
}
