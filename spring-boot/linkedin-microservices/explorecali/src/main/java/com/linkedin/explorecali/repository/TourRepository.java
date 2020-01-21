package com.linkedin.explorecali.repository;

import org.springframework.data.repository.CrudRepository;
import com.linkedin.explorecali.domain.Tour;

public interface TourRepository extends CrudRepository<Tour,Integer>{

}