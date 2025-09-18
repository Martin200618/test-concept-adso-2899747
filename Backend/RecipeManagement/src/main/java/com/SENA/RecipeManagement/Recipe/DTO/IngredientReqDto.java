package com.SENA.RecipeManagement.Recipe.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "IngredientDto", description = "DTO que representa un ingrediente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientReqDto {
    @Schema(description = "Nombre del ingrediente", example = "Tomate")
    private String name;

    @Schema(description = "Cantidad del ingrediente", example = "2")
    private String quantity;

    @Schema(description = "Unidad de medida", example = "unidades")
    private String unit;

    @Schema(description = "ID de la receta a la que pertenece", example = "123e4567-e89b-12d3-a456-426614174000")
    private String recipeId;

    @Schema(description = "Estado del ingrediente (activo/inactivo)", example = "true")
    private Boolean status;
}