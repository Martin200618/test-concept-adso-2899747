package com.SENA.RecipeManagement.Recipe.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ingredient", schema = "recipe")
@Schema(name = "ingredient", description = "Entidad que representa un ingrediente")
public class Ingredient extends ABaseEntity {

    @Schema(description = "Nombre del ingrediente", example = "Tomate")
    private String name;

    @Schema(description = "Cantidad del ingrediente", example = "2")
    private String quantity;

    @Schema(description = "Unidad de medida", example = "unidades")
    private String unit;

    @Schema(description = "ID de la receta a la que pertenece", example = "123e4567-e89b-12d3-a456-426614174000")
    private String recipeId;
}