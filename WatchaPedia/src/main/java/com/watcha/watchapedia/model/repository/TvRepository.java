package com.watcha.watchapedia.model.repository;

import com.watcha.watchapedia.model.entity.Qna;
import com.watcha.watchapedia.model.entity.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TvRepository extends JpaRepository<Tv, Long> {



}
