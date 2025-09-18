package com.SENA.RecipeManagement.Recipe.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recipe", schema = "recipe")
@Schema(name = "recipe", description = "Entidad que representa una receta")
public class Recipe extends ABaseEntity {

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
}