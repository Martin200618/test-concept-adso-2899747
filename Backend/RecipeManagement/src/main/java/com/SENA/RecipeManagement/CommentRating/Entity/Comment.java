package com.SENA.RecipeManagement.CommentRating.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "comment", schema = "comment_rating")
@Schema(name = "comment", description = "Entidad que representa un comentario")
public class Comment extends ABaseEntity {

    @Schema(description = "Contenido del comentario", example = "Esta receta está deliciosa")
    private String content;

    @Schema(description = "ID de la receta asociada", example = "123e4567-e89b-12d3-a456-426614174000")
    private String recipeId;

    @Schema(description = "ID del usuario que hizo el comentario", example = "123e4567-e89b-12d3-a456-426614174000")
    private String userId;
}