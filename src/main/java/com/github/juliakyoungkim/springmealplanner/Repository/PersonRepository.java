package com.github.juliakyoungkim.springmealplanner.Repository;

import com.github.juliakyoungkim.springmealplanner.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {

}
