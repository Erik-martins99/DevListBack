package com.example.DevList.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterDeveloperDTO(@NotBlank(message = "Name is necessary!") String name,
                                   @NotBlank(message = "Nickname is necessary!") String nickname,
                                   @NotBlank(message = "Email is necessary!") @Email String email,
                                   @NotBlank(message = "CPF is necessary") String cpf) {
}
