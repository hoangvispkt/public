package com.api.badminton.infrastructure.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import com.api.badminton.domain.model.Racket;


@Entity
@Table(name = "M_RACKET")
public class RacketEntity {

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRICE")
	private String price;

	public Racket toModel() {
		return new Racket();
	}
}
