package com.tech.identity_provider_service.controller;

import com.tech.identity_provider_service.model.dto.ApiResponse;
import com.tech.identity_provider_service.model.dto.UserDto;
import com.tech.identity_provider_service.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }


    @PostMapping("/saveUser")
    public ResponseEntity<ApiResponse<UserDto>> saveUser(@RequestBody UserDto user) {
        UserDto userResponse = userService.onboardUser(user);
        ApiResponse<UserDto> apiResponse = new ApiResponse<>();
        apiResponse.setSuccess(true);
        apiResponse.setMessage("User created successfully");
        apiResponse.setData(userResponse);
        return ResponseEntity.ok(apiResponse);
    }


}
