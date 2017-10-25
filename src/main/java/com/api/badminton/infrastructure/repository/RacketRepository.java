package com.api.badminton.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.badminton.domain.model.Racket;
import com.api.badminton.infrastructure.dao.RacketDao;


@Repository
public class RacketRepository {

	@Autowired
	private RacketDao racketDao;

	public Racket get(String racketId) {
		return racketDao.get(racketId).toModel();
	}
}
