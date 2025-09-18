package com.SENA.RecipeManagement.CommentRating.IRepository;

import com.SENA.RecipeManagement.CommentRating.Entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepository extends IBaseRepository<Comment> {
    // Métodos específicos para Comment si son necesarios
}