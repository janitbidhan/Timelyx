package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.timelyx.backend.model.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location, String> {
}
