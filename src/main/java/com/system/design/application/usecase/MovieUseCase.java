package com.system.design.application.usecase;

import com.system.design.domain.constant.dto.MovieDto;
import com.system.design.insfratructure.repository.postgres.entities.MovieEntity;

import java.util.List;
import java.util.Optional;

public interface MovieUseCase {
    Optional<MovieEntity> findMovieByTitle(String title);
    List<MovieEntity> findAllMovies();
    MovieEntity saveMovie(MovieDto movieDto);
    MovieEntity updateMovie(MovieEntity newMovie);
    void deleteMovie(MovieEntity oldMovie);
}