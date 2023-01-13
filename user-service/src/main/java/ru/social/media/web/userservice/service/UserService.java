package ru.social.media.web.userservice.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.social.media.web.userservice.model.UserEntity;
import ru.social.media.web.userservice.repository.UserRepository;

import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService implements UserDetailsService {
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity;
        if(isEmail(username)){
            userEntity = userRepository.findByEmail(username).orElse(null);
        }else{
            userEntity = userRepository.findByLogin(username).orElse(null);
        }
        if(userEntity == null){
            throw new UsernameNotFoundException("Username with email or login " + username + " was not found");
        }
        return userEntity;
    }



    private boolean isEmail(String value){
        String pattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        return Pattern.compile(pattern).matcher(value).matches();
    }
}
