package com.SENA.RecipeManagement.CommentRating.IRepository;

import com.SENA.RecipeManagement.CommentRating.Entity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBaseRepository<T extends ABaseEntity> extends JpaRepository<T, String> {
    List<T> findByStatusTrue();
}
