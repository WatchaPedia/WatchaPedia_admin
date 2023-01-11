package com.watcha.watchapedia.model.repository;

import com.watcha.watchapedia.model.entity.AdminUser;
import com.watcha.watchapedia.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findByMovIdx(String movIdx);
}
