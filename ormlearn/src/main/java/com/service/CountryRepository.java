package com.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modal.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
