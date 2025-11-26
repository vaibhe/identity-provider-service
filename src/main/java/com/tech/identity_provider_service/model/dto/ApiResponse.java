package com.tech.identity_provider_service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApiResponse<T> {

    private boolean success;
    private String message;
    private T data;
}
