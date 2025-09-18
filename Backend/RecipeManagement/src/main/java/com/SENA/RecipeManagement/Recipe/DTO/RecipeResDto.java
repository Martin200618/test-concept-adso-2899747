package com.SENA.RecipeManagement.Recipe.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "RecipeDto", description = "DTO que representa una receta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeResDto {
    @Schema(description = "ID único de la receta", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Título de la receta", example = "Pasta Carbonara")
    private String title;

    @Schema(description = "Descripción de la receta", example = "Receta tradicional italiana")
    private String description;

    @Schema(description = "Instrucciones de preparación", example = "Cocinar la pasta, mezclar con la salsa...")
    private String instructions;

    @Schema(description = "Tiempo de preparación en minutos", example = "30")
    private Integer preparationTime;

    @Schema(description = "Número de porciones", example = "4")
    private Integer servings;

    @Schema(description = "Dificultad de la receta", example = "Media")
    private String difficulty;

    @Schema(description = "ID del usuario creador", example = "123e4567-e89b-12d3-a456-426614174000")
    private String userId;

    @Schema(description = "Estado de la receta (activo/inactivo)", example = "true")
    private Boolean status;
}