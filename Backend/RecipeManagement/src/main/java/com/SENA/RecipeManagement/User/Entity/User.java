package com.SENA.RecipeManagement.User.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user", schema = "user")
@Schema(name = "user", description = "Entidad que representa un usuario")
public class User extends ABaseEntity {

    @Schema(description = "Nombre de usuario", example = "john_doe")
    private String username;

    @Schema(description = "Correo electrónico", example = "john@example.com")
    private String email;

    @Schema(description = "Contraseña", example = "password123")
    private String password;

    @Schema(description = "Nombre completo", example = "John Doe")
    private String fullName;

    @Schema(description = "ID del rol del usuario", example = "123e4567-e89b-12d3-a456-426614174000")
    private String roleId;
}