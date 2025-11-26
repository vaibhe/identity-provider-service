package com.tech.identity_provider_service.service.impl;

import com.tech.identity_provider_service.common.Constants;
import com.tech.identity_provider_service.model.dto.UserDto;
import com.tech.identity_provider_service.model.entity.User;
import com.tech.identity_provider_service.repository.IUserRepository;
import com.tech.identity_provider_service.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;


@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDto onboardUser(UserDto user) {
       log.info(Constants.START);
       User newUser = new User();
       newUser.setId(String.valueOf(UUID.randomUUID()));
       newUser.setEmail(user.getEmail());
       newUser.setUsername(user.getUserName());
       newUser.setFirstName(user.getFirstName());
       newUser.setLastName(user.getLastName());
       newUser.setMobileNo(user.getMobileNo());
       newUser.setCreatedAt(LocalDateTime.now());
        userRepository.save(newUser);
       log.info("User onboarded successfully");
       log.info(Constants.END);



       return user;

    }
}
