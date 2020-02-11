package com.github.juliakyoungkim.service;

import com.github.juliakyoungkim.model.Person;
import com.github.juliakyoungkim.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository=repository;
    }

    public Iterable<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(Long id) {
        return repository.findById(id).get();
    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person update(Long id, Person person) {
        Person originalPerson = repository.findById(id).get();
        originalPerson.setEmail(person.getEmail());
        originalPerson.setFirstName(person.getFirstName());
        originalPerson.setPhoneNumber(person.getPhoneNumber());
        return repository.save(originalPerson);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
