package com.github.pgustavo73.citiesapi.countries.repositories;

import com.github.pgustavo73.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
