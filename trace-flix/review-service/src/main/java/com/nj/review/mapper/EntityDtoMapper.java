package com.nj.review.mapper;

import com.nj.review.dto.ReviewDto;
import com.nj.review.entity.Review;

public class EntityDtoMapper {

    public static ReviewDto toDto(Review review){
        return new ReviewDto(
                review.getId(),
                review.getRating(),
                review.getComment(),
                review.getReviewer()
        );
    }

}
