package com.SENA.RecipeManagement.CommentRating.Service;

import com.SENA.RecipeManagement.CommentRating.Entity.Comment;
import com.SENA.RecipeManagement.CommentRating.IRepository.ICommentRepository;
import com.SENA.RecipeManagement.CommentRating.IService.ICommentService;
import com.SENA.RecipeManagement.CommentRating.DTO.CommentReqDto;
import com.SENA.RecipeManagement.CommentRating.DTO.CommentResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends ABaseService<Comment, CommentReqDto, CommentResDto> implements ICommentService {

    @Autowired
    private ICommentRepository repository;

    public CommentService(ICommentRepository repository) {
        super(repository);
    }

    @Override
    public CommentResDto mapToResDto(Comment entity) {
        return CommentResDto.builder()
                .id(entity.getId())
                .content(entity.getContent())
                .recipeId(entity.getRecipeId())
                .userId(entity.getUserId())
                .status(entity.getStatus())
                .build();
    }

    @Override
    public Comment mapToEntity(CommentReqDto reqDto) {
        Comment entity = new Comment();
        entity.setContent(reqDto.getContent());
        entity.setRecipeId(reqDto.getRecipeId());
        entity.setUserId(reqDto.getUserId());
        entity.setStatus(reqDto.getStatus());
        return entity;
    }
}