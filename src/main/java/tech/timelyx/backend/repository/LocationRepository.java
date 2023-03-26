package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.timelyx.backend.model.Location;

public interface LocationRepository extends MongoRepository<Location, String> {
}
