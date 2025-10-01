package com.growthhungry.hellospring.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users",
        uniqueConstraints = @UniqueConstraint(name = "uk_users_username", columnNames = "username"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // подходит для H2
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    // Храним только BCrypt-хэш (~60 символов)
    @Column(nullable = false, length = 60)
    private String passwordHash;
}
