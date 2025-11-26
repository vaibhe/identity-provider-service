package com.tech.identity_provider_service.model.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNo;
}
