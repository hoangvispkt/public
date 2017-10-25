package com.api.badminton.presentation.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.badminton.application.service.RacketService;
import com.api.badminton.domain.model.Racket;


@RestController
public class RacketController {

	@Autowired
	private RacketService racketService;

	// inject via application.properties
	@Value("${welcome.message}")
	private String message = "Hello World";

	@RequestMapping("/racket")
	public Racket get(String racketId) {
		return racketService.get(racketId);
	}

}