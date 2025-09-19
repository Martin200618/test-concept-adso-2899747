package com.SENA.RecipeManagement.CommentRating.Controller;

import com.SENA.RecipeManagement.CommentRating.Entity.Rating;
import com.SENA.RecipeManagement.CommentRating.IService.IRatingService;
import com.SENA.RecipeManagement.CommentRating.DTO.RatingReqDto;
import com.SENA.RecipeManagement.CommentRating.DTO.RatingResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/rating")
public class RatingController extends ABaseController<Rating, RatingReqDto, RatingResDto, IRatingService> {

    public RatingController(IRatingService service) {
        super(service, "Rating");
    }
}