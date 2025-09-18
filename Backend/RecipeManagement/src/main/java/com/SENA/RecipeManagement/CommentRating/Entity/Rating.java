package com.SENA.RecipeManagement.CommentRating.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rating", schema = "comment_rating")
@Schema(name = "rating", description = "Entidad que representa una calificación")
public class Rating extends ABaseEntity {

    @Schema(description = "Valor de la calificación (1-5)", example = "4")
    private Integer value;

    @Schema(description = "ID de la receta calificada", example = "123e4567-e89b-12d3-a456-426614174000")
    private String recipeId;

    @Schema(description = "ID del usuario que hizo la calificación", example = "123e4567-e89b-12d3-a456-426614174000")
    private String userId;
}