
package com.example.demo.domains;

import com.example.demo.impls.UserServiceImpl;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class UserDto {
    public UserDto login(UserServiceImpl userServiceImpl) {
        // TODO Auto-generated method stub
        return userServiceImpl.userRepository.login(this);
    }

    private String userid, password, name;
}
