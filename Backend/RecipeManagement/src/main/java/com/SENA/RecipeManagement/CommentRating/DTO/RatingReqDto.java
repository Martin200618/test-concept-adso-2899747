package com.SENA.RecipeManagement.CommentRating.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "RatingDto", description = "DTO que representa una calificación")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingReqDto {
    @Schema(description = "Valor de la calificación (1-5)", example = "4")
    private Integer value;

    @Schema(description = "ID de la receta calificada", example = "123e4567-e89b-12d3-a456-426614174000")
    private String recipeId;

    @Schema(description = "ID del usuario que hizo la calificación", example = "123e4567-e89b-12d3-a456-426614174000")
    private String userId;

    @Schema(description = "Estado de la calificación (activo/inactivo)", example = "true")
    private Boolean status;
}