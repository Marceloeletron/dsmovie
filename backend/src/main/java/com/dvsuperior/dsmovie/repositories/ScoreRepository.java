package com.dvsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsmovie.entities.Score;
import com.dvsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
