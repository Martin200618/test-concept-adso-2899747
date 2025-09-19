package com.SENA.RecipeManagement.User.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "role", schema = "user")
@Schema(name = "role", description = "Entidad que representa un rol de usuario")
public class Role extends ABaseEntity {

    @Schema(description = "Nombre del rol", example = "ADMIN")
    private String name;

    @Schema(description = "Descripción del rol", example = "Administrador del sistema")
    private String description;
}