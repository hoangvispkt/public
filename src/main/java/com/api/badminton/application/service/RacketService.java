package com.api.badminton.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.badminton.domain.model.Racket;
import com.api.badminton.infrastructure.repository.RacketRepository;

@Service
public class RacketService {

	@Autowired
	private RacketRepository racketRepository;
//
	public Racket get(String racketId) {
		return racketRepository.get(racketId);
	}
}
