package com.SENA.RecipeManagement.CommentRating.Controller;

import com.SENA.RecipeManagement.CommentRating.Entity.Comment;
import com.SENA.RecipeManagement.CommentRating.IService.ICommentService;
import com.SENA.RecipeManagement.CommentRating.DTO.CommentReqDto;
import com.SENA.RecipeManagement.CommentRating.DTO.CommentResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/comment")
public class CommentController extends ABaseController<Comment, CommentReqDto, CommentResDto, ICommentService> {

    public CommentController(ICommentService service) {
        super(service, "Comment");
    }
}