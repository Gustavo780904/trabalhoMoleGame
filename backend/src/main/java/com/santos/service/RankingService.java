package com.santos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santos.domain.Ranking;
import com.santos.repository.RankingRepository;

@Service
public class RankingService {
	@Autowired
	RankingRepository repository;

	public List<Ranking> allFromList() {
		return repository.findAll();
	}
	public Ranking newScore(Ranking score) {
		return repository.save(score);
	}
}
