package com.nj.movie.mapper;


import com.nj.movie.dto.ActorDto;
import com.nj.movie.dto.MovieDto;
import com.nj.movie.dto.ReviewDto;
import com.nj.movie.entity.Movie;

import java.util.List;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie, List<ActorDto> actors, List<ReviewDto> reviews){
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(),
                actors,
                reviews
        );
    }

}
