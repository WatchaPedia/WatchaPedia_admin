package com.watcha.watchapedia.model.repository;

import com.watcha.watchapedia.model.entity.Advertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertiseRepository extends JpaRepository<Advertise, Long> {
}