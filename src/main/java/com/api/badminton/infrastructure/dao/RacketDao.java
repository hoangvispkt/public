package com.api.badminton.infrastructure.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.springframework.stereotype.Component;

import com.api.badminton.infrastructure.entity.RacketEntity;


@Dao
@Component
public interface RacketDao {

	@Select
	RacketEntity get(String racketId);
}
