package com.carpoolingproject.carpoolingserver.repository;

import com.carpoolingproject.carpoolingserver.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
