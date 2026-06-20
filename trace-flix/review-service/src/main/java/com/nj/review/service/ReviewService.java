package com.nj.review.service;

import com.nj.review.dto.ReviewDto;
import com.nj.review.mapper.EntityDtoMapper;
import com.nj.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<ReviewDto> getReviews(Integer movieId) {
        return this.reviewRepository.findByMovieId(movieId)
                                    .stream()
                                    .map(EntityDtoMapper::toDto)
                                    .toList();
    }

}
