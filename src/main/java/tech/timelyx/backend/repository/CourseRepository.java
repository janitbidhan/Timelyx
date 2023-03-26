package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.timelyx.backend.model.Courses;

public interface CourseRepository extends MongoRepository<Courses, String> {
}