package com.appress.repository;

import com.appress.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll,Long> {}
