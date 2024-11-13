package com.system.design.insfratructure.repository.postgres;

import com.system.design.domain.constant.dto.MovieDto;
import com.system.design.application.dao.MovieDAO;
import com.system.design.insfratructure.repository.postgres.entities.MovieEntity;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Primary
public class MovieDAOImpl implements MovieDAO {

    @Override
    public Optional<MovieEntity> findMovieByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public List<MovieEntity> findAllMovies() {
        return List.of();
    }

    @Override
    public MovieEntity saveMovie(MovieDto movieDto) {
        return null;
    }

    @Override
    public MovieEntity updateMovie(MovieEntity newMovie) {
        return null;
    }

    @Override
    public void deleteMovie(MovieEntity oldMovie) {

    }
}
