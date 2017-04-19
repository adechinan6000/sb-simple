package com.example.repositories;

import com.example.domains.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by atsk1618 on 4/18/2017.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
}
