package com.SENA.RecipeManagement.User.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "UserDto", description = "DTO que representa un usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResDto {
    @Schema(description = "ID único del usuario", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Nombre de usuario", example = "john_doe")
    private String username;

    @Schema(description = "Correo electrónico", example = "john@example.com")
    private String email;

    @Schema(description = "Nombre completo", example = "John Doe")
    private String fullName;

    @Schema(description = "ID del rol del usuario", example = "123e4567-e89b-12d3-a456-426614174000")
    private String roleId;

    @Schema(description = "Estado del usuario (activo/inactivo)", example = "true")
    private Boolean status;
}