package com.tech.identity_provider_service.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     // Primary key

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
}
