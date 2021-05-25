package com.github.sysorkole.citiesapi.countries.repository;

import com.github.sysorkole.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
