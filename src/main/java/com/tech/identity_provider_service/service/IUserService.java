package com.tech.identity_provider_service.service;

import com.tech.identity_provider_service.model.dto.UserDto;

public interface IUserService {

    UserDto onboardUser(UserDto user);
}
