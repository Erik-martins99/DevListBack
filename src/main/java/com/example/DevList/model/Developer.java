package com.example.DevList.model;

import com.example.DevList.DTO.RegisterDeveloperDTO;
import com.example.DevList.util.Encryptor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String nickname;
    private String email;
    private String cpf;

    public Developer() {}

    public Developer(RegisterDeveloperDTO data) {
        this.name = data.name();
        this.nickname = data.nickname();
        this.email = data.email();
        this.cpf = Encryptor.enconder(data.cpf());
    }

    public Developer(String name, String nickname, String email, String cpf) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
