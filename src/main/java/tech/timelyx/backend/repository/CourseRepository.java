package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.timelyx.backend.model.Courses;
@Repository
public interface CourseRepository extends MongoRepository<Courses, String> {
}