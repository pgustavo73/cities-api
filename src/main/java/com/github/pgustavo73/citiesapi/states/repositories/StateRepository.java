package com.github.pgustavo73.citiesapi.states.repositories;

import com.github.pgustavo73.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
