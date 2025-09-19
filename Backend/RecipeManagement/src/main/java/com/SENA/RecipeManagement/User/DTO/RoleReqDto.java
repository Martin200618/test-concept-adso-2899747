package com.SENA.RecipeManagement.User.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "RoleDto", description = "DTO que representa un rol de usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleReqDto {
    @Schema(description = "Nombre del rol", example = "ADMIN")
    private String name;

    @Schema(description = "Descripción del rol", example = "Administrador del sistema")
    private String description;

    @Schema(description = "Estado del rol (activo/inactivo)", example = "true")
    private Boolean status;
}