package com.SENA.RecipeManagement.CommentRating.Service;

import com.SENA.RecipeManagement.CommentRating.Entity.Rating;
import com.SENA.RecipeManagement.CommentRating.IRepository.IRatingRepository;
import com.SENA.RecipeManagement.CommentRating.IService.IRatingService;
import com.SENA.RecipeManagement.CommentRating.DTO.RatingReqDto;
import com.SENA.RecipeManagement.CommentRating.DTO.RatingResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService extends ABaseService<Rating, RatingReqDto, RatingResDto> implements IRatingService {

    @Autowired
    private IRatingRepository repository;

    public RatingService(IRatingRepository repository) {
        super(repository);
    }

    @Override
    public RatingResDto mapToResDto(Rating entity) {
        return RatingResDto.builder()
                .id(entity.getId())
                .value(entity.getValue())
                .recipeId(entity.getRecipeId())
                .userId(entity.getUserId())
                .status(entity.getStatus())
                .build();
    }

    @Override
    public Rating mapToEntity(RatingReqDto reqDto) {
        Rating entity = new Rating();
        entity.setValue(reqDto.getValue());
        entity.setRecipeId(reqDto.getRecipeId());
        entity.setUserId(reqDto.getUserId());
        entity.setStatus(reqDto.getStatus());
        return entity;
    }
}