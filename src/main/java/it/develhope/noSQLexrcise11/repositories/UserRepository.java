package it.develhope.noSQLexrcise11.repositories;

import it.develhope.noSQLexrcise11.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {}
