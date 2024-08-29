package com.example.DevList.DTO;

import com.example.DevList.model.Developer;

import java.util.Optional;

public record DetailsDeveloperDTO(Long id,
                                  String name,
                                  String nickname,
                                  String email,
                                  String cpf) {

    public DetailsDeveloperDTO(Developer data) {
        this(data.getId(), data.getName(), data.getNickname(), data.getEmail(), data.getCpf());
    }
}
