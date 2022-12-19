package com.epam.ivanmaiseyenka.jwtusernamepasswordauthentication.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "roles")
@Entity
@Data
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name")
    private String roleName;
}

