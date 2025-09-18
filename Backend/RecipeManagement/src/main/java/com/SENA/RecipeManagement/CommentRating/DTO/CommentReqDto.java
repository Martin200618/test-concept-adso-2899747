package com.SENA.RecipeManagement.CommentRating.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "CommentDto", description = "DTO que representa un comentario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentReqDto {
    @Schema(description = "Contenido del comentario", example = "Esta receta está deliciosa")
    private String content;

    @Schema(description = "ID de la receta asociada", example = "123e4567-e89b-12d3-a456-426614174000")
    private String recipeId;

    @Schema(description = "ID del usuario que hizo el comentario", example = "123e4567-e89b-12d3-a456-426614174000")
    private String userId;

    @Schema(description = "Estado del comentario (activo/inactivo)", example = "true")
    private Boolean status;
}