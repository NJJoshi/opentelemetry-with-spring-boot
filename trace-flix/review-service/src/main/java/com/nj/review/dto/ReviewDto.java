package com.nj.review.dto;

public record ReviewDto(Integer id,
                        Integer rating,
                        String comment,
                        String reviewer) {
}
