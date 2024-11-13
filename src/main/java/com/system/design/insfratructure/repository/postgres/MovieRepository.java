package com.system.design.insfratructure.repository.postgres;

import com.system.design.insfratructure.repository.postgres.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}
