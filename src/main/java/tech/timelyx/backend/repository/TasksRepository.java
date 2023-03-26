package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.timelyx.backend.model.Tasks;

@Repository
public interface TasksRepository extends MongoRepository<Tasks, String> {
}
