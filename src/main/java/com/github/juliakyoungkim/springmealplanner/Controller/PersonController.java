package com.github.juliakyoungkim.springmealplanner.Controller;

import com.github.juliakyoungkim.springmealplanner.Model.Person;
import com.github.juliakyoungkim.springmealplanner.Repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PersonController {
    private final PersonRepository repository;

    PersonController(PersonRepository repository) {
        this.repository=repository;
    }

    @GetMapping("person")
    List<Person> findAll() {
        return  repository.findAll();
    }

    @PostMapping("/person")
    Person create(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping("/person/{id}")
    Person findById(@PathVariable UUID id) {
        return repository.findById(id);
            //    .orElseThrow(() -> new PersonNotFoundException(id));
    }


}
