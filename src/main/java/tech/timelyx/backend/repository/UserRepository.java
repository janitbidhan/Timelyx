package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.timelyx.backend.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
