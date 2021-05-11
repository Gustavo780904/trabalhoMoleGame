package com.santos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santos.domain.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long>{

}
