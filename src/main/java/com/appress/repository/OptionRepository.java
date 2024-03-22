package com.appress.repository;


import com.appress.domain.OptionResponse;
import org.springframework.data.repository.CrudRepository;



public interface OptionRepository  extends CrudRepository<OptionResponse, Long> {}