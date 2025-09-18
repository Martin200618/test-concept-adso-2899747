package com.SENA.RecipeManagement.User.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "RoleDto", description = "DTO que representa un rol de usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleResDto {
    @Schema(description = "ID único del rol", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Nombre del rol", example = "ADMIN")
    private String name;

    @Schema(description = "Descripción del rol", example = "Administrador del sistema")
    private String description;

    @Schema(description = "Estado del rol (activo/inactivo)", example = "true")
    private Boolean status;
}