package com.github.juliakyoungkim.repository;

import com.github.juliakyoungkim.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
