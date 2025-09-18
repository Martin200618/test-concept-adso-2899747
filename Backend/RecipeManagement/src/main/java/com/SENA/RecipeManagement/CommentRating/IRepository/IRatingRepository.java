package com.SENA.RecipeManagement.CommentRating.IRepository;

import com.SENA.RecipeManagement.CommentRating.Entity.Rating;
import org.springframework.stereotype.Repository;

@Repository
public interface IRatingRepository extends IBaseRepository<Rating> {
    // Métodos específicos para Rating si son necesarios
}