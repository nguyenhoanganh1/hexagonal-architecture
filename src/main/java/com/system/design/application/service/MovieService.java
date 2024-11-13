package com.system.design.application.service;

import com.system.design.application.dao.MovieDAO;
import com.system.design.domain.constant.dto.MovieDto;
import com.system.design.application.usecase.MovieUseCase;
import com.system.design.insfratructure.repository.postgres.entities.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MovieService implements MovieUseCase {

    private final MovieDAO movieDAO;

    @Override
    public Optional<MovieEntity> findMovieByTitle(String title) {
        return movieDAO.findMovieByTitle(title);
    }

    @Override
    public List<MovieEntity> findAllMovies() {
        return movieDAO.findAllMovies();
    }

    @Override
    public MovieEntity saveMovie(MovieDto movieDto) {
        return movieDAO.saveMovie(movieDto);
    }

    @Override
    public MovieEntity updateMovie(MovieEntity newMovie) {
        return movieDAO.updateMovie(newMovie);
    }

    @Override
    public void deleteMovie(MovieEntity oldMovie) {
        movieDAO.deleteMovie(oldMovie);
    }
}
